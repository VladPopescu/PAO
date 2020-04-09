package com.company.ex3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DiferenteLinkedListVsArrayList {
	public static final int N = 100000;

	public static void testAdd(List lst) {
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < N; i++) {
			lst.add(i);
		}
		long t2 = System.currentTimeMillis();
		System.out.println(" Add: " + (t2 - t1));
	}

	public static void testGet(List lst) {
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < N; i++) {
			lst.get(i);
		}
		long t2 = System.currentTimeMillis();
		System.out.println(" Get: " + (t2 - t1));
	}

	public static void testRemove(List lst) {
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < N; i++) {
			lst.remove(0);
		}
		long t2 = System.currentTimeMillis();
		System.out.println(" Remove : " + (t2 - t1));
	}

	public static void main(String args[]) {
		System.out.println("ArrayList ");
		List lst1 = new ArrayList();
		testAdd(lst1);
		testGet(lst1);
		testRemove(lst1);
		System.out.println();
		System.out.println("LinkedList ");
		List lst2 = new LinkedList();
		testAdd(lst2);
		testGet(lst2);
		testRemove(lst2);
	}
}
