package com.company.ex4;

import com.company.ex3.MyThread;
import com.company.ex3.MyThread2;

public class Main {

	public static void main(String [] args){
		Thread thread = new Thread();
		System.out.println(thread.getPriority());
		thread.setPriority(10);
		System.out.println(thread.getPriority());

	}
}
