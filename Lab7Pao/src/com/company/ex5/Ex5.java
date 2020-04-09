package com.company.ex5;

import java.util.TreeSet;

public class Ex5 {

	public static void main(String [] args){
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(23);
		treeSet.add(43);
		treeSet.add(11);
		treeSet.add(53);
		System.out.println(treeSet);


		TreeSet<String> treeSetString = new TreeSet<>();
		treeSetString.add("a");
		treeSetString.add("c");
		treeSetString.add("b");
		treeSetString.add("a");
		System.out.println(treeSetString);
		System.out.println(treeSet.pollFirst());
		System.out.println(treeSet.pollLast());
	}
}
