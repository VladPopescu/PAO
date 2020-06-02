package com.pao.examen.part1.p1;

public class Part1_3 {

	public static void main(String[] args) {
		String s = "abcbd";
		String t = "Programare";
		// p = 5
		int p = t.indexOf(s.charAt(0));
		// progr + amare
		t = t.substring(0, p) + t.substring(p+1);
		System.out.println(t);
		// c) Progrmare
	}
}
