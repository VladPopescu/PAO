package com.company.ex6;

public class Main {

	public static void main(String[] args) {
//		System.out.println( Thread.currentThread().isDaemon());
//
//		Thread thread = new Thread();
//		thread.setDaemon(false);

		MyDaemonThread d1 = new MyDaemonThread("d1", true);

		MyDaemonThread d2 = new MyDaemonThread("d2", true);


		d1.start();
		d2.start();
	}
}
