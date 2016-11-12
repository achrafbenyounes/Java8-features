package com.newolynk.learning;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceExample {

	public static void main(String[] args) {
	   
	  List<String> names = new ArrayList<String>();
			
	  names.add("Mahesh");
	  names.add("Suresh");
	  names.add("Ramesh");
	  names.add("Naresh");
	  names.add("Kalpesh");
	  
	  System.out.println("first version of forEach without method reference");
	  names.forEach(x -> System.out.println(x));
	  System.out.println("second version of forEach without method reference");
      names.forEach(System.out::println);
     
	}

}
