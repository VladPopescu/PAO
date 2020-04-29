package com.company.ex8;

public class Main {

	public static void main(String [] args){
		Message message = new Message("Mesaj");

		Waiter waiter = new Waiter(message);
		new Thread(waiter, "waiter").start();

		Waiter waiter2 = new Waiter(message);
		new Thread(waiter2, "waiter2").start();


		Notifier notifier = new Notifier(message);
		new Thread(notifier, "notifier").start();



	}
}
