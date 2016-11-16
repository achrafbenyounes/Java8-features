package com.newolynk.learning;

import java.util.Arrays;
import java.util.List;

public class MapReduceLambdaExpression {

	public static void main(String[] args) {
 
		List<Integer> housePrice = Arrays.asList(150000, 320000, 450000, 220000);
		System.out.println("*** Add dollar currency for each element of the list without using the map function (in the old way) ***");
        
		for (Integer price: housePrice) {
        	System.out.println(price + " $");
        }
       
		System.out.println("*** Add dollar currency for each element of the list using the map function (java 8 lambda expression with map aggregation function) ***");
        housePrice.stream()
        		  .map(x -> x + " $")
        		  .forEach(System.out::println);
        
        //Now we want to sum all the house price in housePrice list (using java old way and the power of java 8 reduce in this case
        
        System.out.println("*** The sum of all the house price in java old way ***");
        int total = 0;
        for (Integer price : housePrice) {
        	total += price;
        }
        System.out.println("Sum is : " + total + " $");
        
        System.out.println("*** The sum of all the house price in java 8 using reduce function ***");
        total = housePrice.stream().reduce((sum, price) -> sum + price).orElse(0);
        System.out.println("Sum is : " + total + " $");
                  
                  
	
	}

}
