package com.company.ex1;

public class MyThread extends Thread {

	public MyThread(String name){
		super(name);
	}

	@Override
	public void run(){
		while (true){
			System.out.println("Procesul ruleaza");
		}
	}

}
