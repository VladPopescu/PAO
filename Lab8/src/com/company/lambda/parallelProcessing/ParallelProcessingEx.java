package com.company.lambda.parallelProcessing;

import java.util.function.IntToLongFunction;
import java.util.stream.IntStream;

public class ParallelProcessingEx {

	public static void main(String[] args) {

		System.out.println("Warmup...");
		for (int i = 0; i < 5000; ++i) {
			run(ParallelProcessingEx::testLoop, 5000);
			run(ParallelProcessingEx::testStream, 5000);
			run(ParallelProcessingEx::testParallel, 5000);
		}
		System.out.println("Benchmark...");
		int bound = 10000000;
		System.out.printf("Loop:     %s\n", run(ParallelProcessingEx::testLoop, bound));
		System.out.printf("Stream:   %s\n", run(ParallelProcessingEx::testStream, bound));
		System.out.printf("Parallel: %s\n", run(ParallelProcessingEx::testParallel, bound));
	}

	public static boolean isPrime(int value) {
		for (int i = 2; i * i <= value; ++i) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static long testLoop(int bound) {
		long count = 0;
		for (int i = 2; i < bound; ++i) {
			if (isPrime(i)) {
				++count;
			}
		}
		return count;
	}

	public static long testStream(int bound) {
		return IntStream.range(2, bound).filter(ParallelProcessingEx::isPrime).count();
	}

	public static long testParallel(int bound) {
		return IntStream.range(2, bound).parallel().filter(ParallelProcessingEx::isPrime).count();
	}

	public static String run(IntToLongFunction operation, int bound) {
		long start = System.currentTimeMillis();
		long count = operation.applyAsLong(bound);
		long millis = System.currentTimeMillis() - start;
		return String.format("%4.2fs (%d)", millis / 1000.0, count);
	}

}
