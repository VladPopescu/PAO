package com.company.ex8;

public class Waiter implements Runnable {

	private Message message;

	public Waiter(Message m) {
		this.message = m;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();

		synchronized (message) {
			try {
				System.out.println(name + " asteapta sa fie notificat la timpul: " + System.currentTimeMillis());
				message.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " firul waiter a fost notificat la:" + System.currentTimeMillis());
			System.out.println(name + " a procesat" + message.getContent());
		}

	}
}
