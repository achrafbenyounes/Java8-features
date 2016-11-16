package com.newolynk.learning;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaExpressionCombinePredicateExample {

	public static void main(String[] args) {
		
		Predicate<String> startsWithA = s -> s.startsWith("A");
		Predicate<String> startsWithD = s -> s.startsWith("D");
		Predicate<String> endsWithR   = s -> s.endsWith("r");
		
		List<String> listJobs = Arrays.asList("Accountant", "Actor", "Athlete", 
                "Brain Scientist", "Coach", "Computer software developer",
                "Dancer", "Database administrator", "Dentist", "Farmer", "FBI Agent");
		
		System.out.println("*** Give me all the jobs starts with letter A ***");
		listJobs.stream()
		        .filter(startsWithA)
		        .forEach(System.out::println);
		
		System.out.println("*** Give me all the jobs starts with letter D and ends with R ***");
		listJobs.stream()
		        .filter(startsWithD.and(endsWithR))
		        .forEach(i -> System.out.println(i));

	}

}
