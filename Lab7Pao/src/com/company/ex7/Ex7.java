package com.company.ex7;

import java.util.LinkedHashSet;

public class Ex7 {

	public static void main(String [] args){
		// HashSet > LinkedHashSet > TreeSet
		LinkedHashSet linkedHashSet = new LinkedHashSet();

		linkedHashSet.add(1);
		linkedHashSet.add(2);
		linkedHashSet.add(6);
		linkedHashSet.add(3);
		linkedHashSet.add(4);
		linkedHashSet.add(5);

		System.out.println(linkedHashSet);
	}
}
