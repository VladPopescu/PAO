package com.company.ex6;

public class MyDaemonThread extends Thread {

	public MyDaemonThread(String name, boolean isDaemon){
		super(name);
		setDaemon(isDaemon);
	}

	@Override
	public void run(){
		for (int i =1 ; i< 5 ; i++){
			try {
				sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(getName() + "se ruleaza");
		}
	}
}
