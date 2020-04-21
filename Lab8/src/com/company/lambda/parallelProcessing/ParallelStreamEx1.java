package com.company.lambda.parallelProcessing;

import java.util.stream.Stream;

public class ParallelStreamEx1 {

	public static void main(String [] args){
		Stream.of("John", "Mike", "Ryan","Donald", "Matthew").forEach(System.out::println);
		System.out.println();
		Stream.of("John", "Mike", "Ryan","Donald", "Matthew").parallel().forEach(System.out::println);

	}
}
