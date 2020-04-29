package com.company.ex5;

public class SelfishThread extends Thread {

	public SelfishThread(String name){
		super(name);
	}

	@Override
	public void run() {

		int i = 0;
		while (i < 10000) {
			i++;
			if (i % 100 == 0) {
				System.out.println(getName() + " a ajuns la numarul " + i);
			}
		}
	}
}
