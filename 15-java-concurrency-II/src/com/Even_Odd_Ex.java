package com;

import java.util.concurrent.TimeUnit;

public class Even_Odd_Ex {

	private static Object lock = new Object();
	private static boolean displayOdd = true;

	public static void main(String[] args) {

		Runnable oddTask1 = () -> {
			String name = Thread.currentThread().getName();
			for (int i = 1; i <= 10; i++) {
				synchronized (lock) {
					if (i % 2 != 0) {
						if (!displayOdd) {
							try {
								lock.wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						System.out.println(name + " : " + i);
						displayOdd = false;
						lock.notifyAll();
					}
					try {
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}

		};

		Runnable evenTask = () -> {
			String name = Thread.currentThread().getName();

			for (int i = 1; i <= 10; i++) {
				synchronized (lock) {
					if (i % 2 == 0) {
						if (displayOdd) {
							try {
								lock.wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}

						}
						System.out.println(name + " : " + i);
						displayOdd = true;
						lock.notifyAll();
					}

				}
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread evenThread = new Thread(evenTask, "EVEN");
		Thread oddThread1 = new Thread(oddTask1, "ODD-1");
		
		System.out.println(evenThread.getState());

		evenThread.start();
		oddThread1.start();

	}

}
