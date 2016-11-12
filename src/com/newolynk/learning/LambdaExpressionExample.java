package com.newolynk.learning;

public class LambdaExpressionExample {

	public static void main(String[] args) {
		
		LambdaExpressionExample  testerLambda = new LambdaExpressionExample();
    
		MathOperation addition       = (int a, int b) -> a + b;
		MathOperation substruction   = (int a, int b) -> a - b;
		MathOperation multiplication = (int a, int b) -> a * b;
		MathOperation division       = (int a, int b) -> a / b;
		
		System.out.println("  10 + 8 = " + testerLambda.doOpereation(10, 8, addition));
		System.out.println("  10 - 8 = " + testerLambda.doOpereation(10, 8, substruction));
		System.out.println("  10 * 8 = " + testerLambda.doOpereation(10, 8, multiplication));
		System.out.println("  20 / 5 = " + testerLambda.doOpereation(20, 5, division));
		
		GreetingService greetingService = message -> System.out.println(message);
		greetingService.sayMessage("Achraf BEN YOUNES");
	}
	
	interface MathOperation {
		int operation(int a, int b);
	}
	
	interface GreetingService {
		void sayMessage(String message);
	}
	
	private int doOpereation (int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

}
