package com.company.lambda.functionalInterface;

import java.util.function.Predicate;

public class CheckForNull implements Predicate<Long> {

	@Override
	public boolean test(Long aLong) {
		return aLong != null;
	}
}
