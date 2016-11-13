package com.newolynk.learning;

import com.newolynk.learning.Person.*;

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

	}

}
