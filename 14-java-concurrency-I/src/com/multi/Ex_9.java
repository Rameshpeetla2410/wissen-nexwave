package com.multi;

import java.util.concurrent.TimeUnit;

class Building {

	static Object lock1 = new Object();
	static Object lock2 = new Object();

	public void takeSleep() {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void room1() {
		synchronized (lock1) {
			Thread thread = Thread.currentThread();
			String name = thread.getName();
			System.out.println(name + " entering in room1");
			takeSleep();
			System.out.println(name + " leaving in room1");
		}
	}

	public void room2() {
		synchronized (lock1) {
			Thread thread = Thread.currentThread();
			String name = thread.getName();
			System.out.println(name + " entering in room2");
			takeSleep();
			System.out.println(name + " leaving in room2");
		}
	}

}

public class Ex_9 {

	public static void main(String[] args) {

		Building building1 = new Building();
		Building building2 = new Building();

		Runnable task1 = () -> {
			building1.room1();
		};

		Runnable task2 = () -> {
			building2.room2();
		};

		Thread thread1 = new Thread(task1, "A");
		Thread thread2 = new Thread(task1, "B");
		Thread thread3 = new Thread(task2, "C");

		thread1.start();
		thread2.start();
		thread3.start();

	}

}
