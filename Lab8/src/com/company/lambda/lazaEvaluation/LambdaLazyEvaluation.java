package com.company.lambda.lazaEvaluation;

import java.util.function.Supplier;

public class LambdaLazyEvaluation {
	/*
		One of the most important characteristics of streams is that they allow for significant optimizations through lazy evaluations.

		A possible reason against this is if longer methods are put into the if statement, maybe with a few parameters,
		 it will start to get messy and you might struggle to read it.

 	*/
	public static void main(String[] args) {
		final int number = 4;
		//		final boolean computeResult = compute(number);
		//		final boolean processResult = process(number);

		final Supplier<Boolean> computeResult = () -> compute(number);
		final Supplier<Boolean> processResult = () -> process(number);
		if (computeResult.get() && processResult.get()) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
	}

	public static boolean compute(final int number) {
		System.out.println("computing number : " + number);
		return number > 5 ? true : false;
	}

	public static boolean process(final int number) {
		System.out.println("processing number : " + number);
		return number % 3 == 0 ? true : false;
	}
}

/*
	Through the use of some lazy lambdas we can keep our code easy to read without sacrificing performance by executing unneeded operations.
 */
