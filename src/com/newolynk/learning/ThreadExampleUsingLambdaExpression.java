package com.newolynk.learning;

public class ThreadExampleUsingLambdaExpression {

	public static void main(String[] args) {
     
	  //Declaring a thread in the old java way
	  Runnable th1 = new Runnable() {
		@Override
		public void run() {
			System.out.println("Working with thread in the old way");		
		}  
	  };
	  
	  Runnable th2 = () -> System.out.println("Working with thread in java 8");

      new Thread(th1).start();
      new Thread(th2).start();

	}

}
