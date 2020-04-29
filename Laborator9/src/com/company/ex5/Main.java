package com.company.ex5;

public class Main {
	public static void main(String [] args){
		SelfishThread s1 = new SelfishThread("Firul 1");
		SelfishThread s2 = new SelfishThread("Firul 2");
		s1.setPriority(1);
		s2.setPriority(1);

		s1.start();
		s2.start();
	}
}
