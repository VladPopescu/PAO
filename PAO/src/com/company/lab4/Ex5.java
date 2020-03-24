package com.company.lab4;

public class Ex5 {
	public static void main(String [] args){
		String s = "abccba";
		StringBuilder sb = new StringBuilder(s);
		String reversed = sb.reverse().toString();

		System.out.println(s.equals(reversed));
	}
}
