package com.newolynk.learning;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, -3, 4, 5, -6, 7, 0, 9);
		
		//Print all numbers: Make the predicate boolean function equal to true
		System.out.println("Print all numbers");
		evaluate(list, n -> true);
		
		//Print all positive numbers
		System.out.println("Print all positive numbers");
		evaluate(list, n -> n> 0);
		
		//Print all negative numbers
		System.out.println("Print all negative numbers");
		evaluate(list, n -> n < 0);
		
		//Print all numbers equal to 0
		System.out.println("Print all 0 numbers");
		evaluate(list, n -> n ==0);
	}
	
	public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
		for (Integer n: list) {
			if (predicate.test(n)) {
				System.out.println(n);
			}
		}
	}

}
