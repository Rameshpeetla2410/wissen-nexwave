package com.multi;

import java.util.concurrent.TimeUnit;

public class Ex_8 {

	static class Building {

		public static void takeSleep() {
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		public synchronized static void room1() {
			Thread thread = Thread.currentThread();
			String name = thread.getName();
			System.out.println(name + " entering in room1");
			takeSleep();
			System.out.println(name + " leaving in room1");
		}

		public synchronized static void room2() {
			Thread thread = Thread.currentThread();
			String name = thread.getName();
			System.out.println(name + " entering in room2");
			takeSleep();
			System.out.println(name + " leaving in room2");
		}

	}

	public static void main(String[] args) {

		Runnable task1 = () -> {
			Building.room1();
		};

		Runnable task2 = () -> {
			Building.room2();
		};

		Thread thread1 = new Thread(task1, "A");
		Thread thread2 = new Thread(task1, "B");
		Thread thread3 = new Thread(task2, "C");

		thread1.start();
		thread2.start();
		thread3.start();

	}

}
