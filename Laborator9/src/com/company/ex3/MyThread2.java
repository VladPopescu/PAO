package com.company.ex3;

public class MyThread2 extends Thread {

	public MyThread waitedThread;

	public MyThread2(String name, MyThread myThread){
		super(name);
		this.waitedThread = myThread;
	}

	@Override
	public void run(){
		System.out.println(getName() + "is running");
		for (int i =1 ; i< 5 ; i++){
			try {
				waitedThread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println(getName() + " was finished");

	}

}
