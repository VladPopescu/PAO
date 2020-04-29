package com.company.ex8;

public class Notifier  implements Runnable{

	private Message message;

	public Notifier(Message message) {
		this.message = message;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("Firul " + name + " a pornit ");

		try {
			Thread.sleep(1000);
			synchronized (message){
				message.setContent(name + " a procesat mesajul");
				message.notifyAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
