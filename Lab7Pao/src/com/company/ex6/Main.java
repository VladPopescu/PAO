package com.company.ex6;

import java.util.TreeSet;

public class Main {

	public static void main(String [] args){
		TreeSet treeSet = new TreeSet(new FruitComparator());
		treeSet.add(new Fruit("ananas"));
		treeSet.add(new Fruit("portocale"));
		treeSet.add(new Fruit("banane"));
		treeSet.add(new Fruit("mere"));
		treeSet.add(new Fruit("kiwi"));

		System.out.println(treeSet);

	}
}
