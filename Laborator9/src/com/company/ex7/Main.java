package com.company.ex7;

public class Main {
	public static void main(String [] args){
		TableMultiply tableMultiply = new TableMultiply();
		MyThread myThread = new MyThread("Thread1", tableMultiply);
		MyThread1 myThread1 = new MyThread1("Thread2", tableMultiply);

		myThread.start();
		myThread1.start();
	}
}
