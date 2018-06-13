package com.multi;

import java.util.concurrent.TimeUnit;

public class Ex_4 {

	public static void main(String[] args) throws InterruptedException {

		Runnable lazyWork = new Runnable() {
			@Override
			public void run() {
				System.out.println("lazy work started..");
				try {
					TimeUnit.SECONDS.sleep(10);
					System.out.println("lazy work finished");
				} catch (InterruptedException e) {
					System.out.println("got interrupt.. ");
				}
			}
		};

		Thread thread = new Thread(lazyWork);
		thread.start();

		TimeUnit.SECONDS.sleep(5);

		thread.interrupt();

	}

}
