package com.newolynk.learning;

public class DefaultMethodInterfaceExample {
	public static void main(String []args) {
		DefaultMethodInterfaceExample methodInteface = new DefaultMethodInterfaceExample();
	      Vehicle vehicle = methodInteface.new Car();
	      vehicle.print();
	}
	
	interface Vehicle {
		default void print() {
			System.out.println("I \'m a car");
		}
		
		static void blowHorn(){
			System.out.println("Blowing horn!!!");
	    }	
	}
	
	interface Fivewheel {
		default void print() {
			System.out.println("I m a special car with fivewheel");
		}	
	}
	
	class Car implements Vehicle, Fivewheel {
		public void print() {
			Vehicle.super.print();
			Fivewheel.super.print();
			Vehicle.blowHorn();
			System.out.println("I m a car");
		}
		
	}
}
