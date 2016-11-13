package com.newolynk.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MultipleConditionStreamExample {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("mkyong", 20),
				new Person("michael", 21), new Person("lawrence", 23));

			Person result = persons.stream()
				.filter((x) -> "michael".equals(x.getName()) && 21==x.getAge())
				.findAny()
				.orElse(null);

			//return found not null in this case
             System.out.println(result.getName());
             
             MultipleConditionStreamExample testFlatMap = new MultipleConditionStreamExample();
             
             //FlatMap stream example
             Employee emp1 = testFlatMap.new Employee("Achraf", 32, "JAVA Developer");
             Employee emp2 = testFlatMap.new Employee("Michael",34, "Tester");
             Employee emp3 = testFlatMap.new Employee("Jack",   29, "JAVA Architect");
             
             List<Employee> listEmployee = new ArrayList<Employee>();
             listEmployee.add(emp1);
             listEmployee.add(emp2);
             listEmployee.add(emp3);
             
             Company neolynkCompany = testFlatMap.new Company("Neolynk", 50);
             neolynkCompany.listEmployee = listEmployee;
             
             List<Company> listCompany = new ArrayList<Company>();
             listCompany.add(neolynkCompany);
             
             Employee emp = listCompany.stream()
             			.flatMap(x -> x.listEmployee.stream())
             			.filter(x -> x.name.startsWith("Ac"))
             			.findAny()
             			.orElse(null);
             
             System.out.println("The name is equal to " + emp.name + " after a series steam aggregation functions");
             		
	}
	
	class Company {
		String companyName;
		Integer numberOfEmployee;
		List<Employee> listEmployee = new ArrayList<Employee>();
		
		Company (String companyName, Integer numberOfEmployee) {
			this.companyName = companyName;
			this.numberOfEmployee = numberOfEmployee;
		}
		
	}
	
	class Employee {
		String name;
		Integer age;
		String job;
		Employee(String name, Integer age, String job) {
			this.name = name;
			this.age = age;
			this.job = job;
		}
	}

}
