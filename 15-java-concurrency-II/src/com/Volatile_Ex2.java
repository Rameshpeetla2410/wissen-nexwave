package com;

public class Volatile_Ex2 {

	volatile static boolean isStop = false;

	public static void main(String[] args) throws InterruptedException {

		Runnable player = () -> {
			while (!isStop) {
			}
		};

		Thread thread = new Thread(player);
		thread.start();

		thread.join(5000);
		isStop = true;

	}

}
