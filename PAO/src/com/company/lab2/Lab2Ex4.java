package com.company.lab2;

import java.util.*;

public class Lab2Ex4 {

	public static void main(String[] args) {
//		int[] a = { 1, 24, 6, 2, 123, 65 };
//		Arrays.sort(a);
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//		}
		// Output: 1 2 6 24 65 123

//		int[] b = { 1, 2, 3, 4 };
//		int[] c = { 1, 2, 3, 4 };
//		System.out.println(Arrays.equals(b, c));
//
//		int[] d = { 1, 2, 3, 4 };
//		int[] e = { 4, 3, 2, 1 };
//
//		System.out.println(Arrays.equals(d, e));

		int[] f = { 1, 3, 4, 5 };
		Arrays.binarySearch(f, 4);
		System.out.println(Arrays.binarySearch(f, 4));


	}
}
