package com.company.ex7;

public class MyThread1 extends Thread {

	TableMultiply tableMultiply;

	public MyThread1(String name, TableMultiply tableMultiply) {
		super(name);
		this.tableMultiply = tableMultiply;
	}

	@Override
	public void run() {
		tableMultiply.printMultiplyTable(100);

	}

}
