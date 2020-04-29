package com.company.ex2;

public class Main {

	public static void main(String [] args){
		Thread thread = new Thread();
		System.out.println(thread.getState());
		System.out.println(thread.getName());
		System.out.println(thread.getThreadGroup().getName());
		ThreadGroup threadGroup = new ThreadGroup("ThreadGroup1");
		Thread thread1 = new Thread(threadGroup , "ThreadName");
		System.out.println(thread1.getThreadGroup().getName());
	}
}
