package com.company.ex3;

public class MyThread extends Thread {

	public MyThread(String name){
		super(name);
	}

	@Override
	public void run(){
		System.out.println(getName() + "is running");
		for (int i =1 ; i< 5 ; i++){
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(getName() + "writes " + i);
		}

	}

}
