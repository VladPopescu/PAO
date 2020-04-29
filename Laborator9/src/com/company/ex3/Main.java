package com.company.ex3;

public class Main {

	public static void main(String [] args){
		MyThread myThread = new MyThread("Mythread");
		MyThread2 myThread2 = new MyThread2("Secondthread", myThread);
		myThread.start();
		myThread2.start();
	}
}
