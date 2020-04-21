package com.company.lambda.sintaxa;

public class LambdaSyntax {

	public static void main(String[] args) {

		// ( int arg1, String args2 )      ->        System.out.println( "Two arguments " + arg1 + " and " + arg2);
		//   argument list			  arrow token    Body of lambda expression

		// no argument - un singur statement, fara acolade
		LambdaInterface lambdaInterface = () -> System.out.println("Hello World");

		lambdaInterface.show();

		// one argument - single statement with curly braces

		//		LambdaInterface anotherLambdaInterface = (message) -> { System.out.print(message);};
		LambdaSecondInterface secondInterface = (message) -> System.out.println(message);

		secondInterface.show(5);

		// with two argument and types
		LambdaThirdInterface lambdaThirdInterface = (int a, int b) -> {
			return a * b;
		};
		System.out.println(lambdaThirdInterface.compute(5, 4));

		// two arguments - multiple statements
		LambdaFourthInterface lambdaFourthInterface = (int a, int c) -> {
			if (a > c) {
				System.out.println("Primul element este mai mare");
			} else {
				System.out.println("Al doilea element este mai mare");
			}
		};

		lambdaFourthInterface.doSomething(4, 20);

		LambdaFifthInterface lambdaFifthInterface = (int a, int c, int b) -> {
			System.out.println(a + " " + b + " " + c);
		};
		lambdaFifthInterface.doSomething(5,4, 3);
	}
}
