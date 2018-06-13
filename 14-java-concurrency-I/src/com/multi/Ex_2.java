package com.multi;

// Thread life-cycle

public class Ex_2 {

	public static void main(String[] args) {

		Runnable task = new Runnable() {
			// READY_TO_RUN ==> RUNNING
			@Override
			public void run() {
				Thread thread = Thread.currentThread();
				for (int i = 0; i < 500; i++) {
					// RUNNING ==> READY_TO_RUN
					// or
					// RUNNING ==> NOT_READY_TO_RUN ( sleep | blocked | wait )
					System.out.println(thread.getName() + "->" + i);
				}
			}// RUNNING ==> DEAD
		};

		Thread thread1 = new Thread(task, "A"); // NEW
		Thread thread2 = new Thread(task, "B");
		thread1.start(); // NEW ==> READY_TO_RUN
		thread2.start();

		Thread thread = Thread.currentThread();
		for (int i = 0; i < 500; i++) {
			System.out.println(thread.getName() + "->" + i);
		}

	}

}
