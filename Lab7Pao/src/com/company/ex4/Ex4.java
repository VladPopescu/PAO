package com.company.ex4;

import java.util.HashSet;
import java.util.Set;

public class Ex4 {

	public static void main(String [] args){
		HashSet hashSet = new HashSet();
		Set setCollection = new HashSet();

		hashSet.add("a");
		hashSet.add("b");
		hashSet.add("c");
		hashSet.add("c");
		hashSet.add("c");
		hashSet.add("d");
		hashSet.add("e");
		hashSet.add("f");
		hashSet.add("g");
		hashSet.add("g");
		hashSet.add("g");
		hashSet.add(null);
		hashSet.add(null);
		System.out.println(hashSet);

	}
}
