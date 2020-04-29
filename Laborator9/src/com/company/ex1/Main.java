package com.company.ex1;

public class Main {

	public static void main(String [] args){
//		System.out.println(Thread.currentThread().getName());
//		Thread thread = new Thread();
//
//		thread.run();
//		System.out.println(thread.getState());
//		thread.start();
//		System.out.println(thread.getState());

		MyThread myThread = new MyThread("Thread1");
		myThread.run();
//		myThread.stop();

		MyRunnableThread myRunnableThread = new MyRunnableThread();
		Thread thread1 = new Thread(myRunnableThread);
		thread1.run();
	}
}
