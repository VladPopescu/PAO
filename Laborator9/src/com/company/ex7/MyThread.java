package com.company.ex7;

public class MyThread extends Thread {

	TableMultiply tableMultiply;

	public MyThread(String name, TableMultiply tableMultiply) {
		super(name);
		this.tableMultiply = tableMultiply;
	}

	@Override
	public void run() {
		tableMultiply.printMultiplyTable(5);

	}

}
