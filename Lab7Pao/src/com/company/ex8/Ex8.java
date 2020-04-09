package com.company.ex8;

import java.util.HashMap;
import java.util.TreeMap;

public class Ex8 {

	public static void main(String [] args){
		HashMap hashMap = new HashMap();
		hashMap.put("1", "valoarea");
		hashMap.put("2", "valoarea1");
		hashMap.put("3", "valoarea2");
		hashMap.put("4", "valoarea3");
		hashMap.put("5", "valoarea4");
		hashMap.put("5", "valoarea4");
		System.out.println(hashMap);

		TreeMap treeMap = new TreeMap();
		treeMap.put("1", "valoarea");
		treeMap.put("2", "valoarea1");
		treeMap.put("3", "valoarea2");
		treeMap.put("4", "valoarea3");
		treeMap.put("5", "valoarea4");
		treeMap.put("5", "valoarea4");
		System.out.println(treeMap);
	}
}
