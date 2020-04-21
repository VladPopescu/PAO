package com.company.lambda.functionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierInterface {

	public static void main(String [] args){
		/*
			java.util.function.Function
			- reprezinta o functie/metoda care primeste un singur parametru si intoarce o singura valoare

			public interface Function<T,R> {

    			public <R> apply(T parameter);
			}
		 */

		Function<Long, Long> adder = new AddThree();
		Long result = adder.apply((long) 4);


		Function<Long, Long> adder2 = (value) -> value + 3;
		Long resultLambda = adder2.apply((long) 8);
		System.out.println("resultLambda = " + resultLambda);

		/*
			java.util.function.Predicate
			- reprezinta o functie/metoda care primeste un singur parametru si intoarce true sau false

			public interface Predicate {
   				 boolean test(T t);
			}
		 */

		Predicate<Long> predicate = new CheckForNull();
		Boolean status = predicate.test(null);
		System.out.println(status);

		Predicate<Long> lambdaPredicate = s -> s !=null;
		Boolean statusLambda = lambdaPredicate.test(null);
		System.out.println(statusLambda);


		/*
			java.util.function.Consumer
			- reprezinta o functie/metoda care consuma un  parametru fara sa intoarca vreun rezultat

		 */

		Consumer<Integer> consumer = (value) -> System.out.println(value);
		consumer.accept(20);

		/*
			java.util.function.Supplier
			- reprezinta o functie/metoda care nu primeste niciun parametru dar intoarce o valoare
		 */

		Supplier<Double> randomValue = () -> Math.random();
		System.out.println(randomValue.get());

	}

}
