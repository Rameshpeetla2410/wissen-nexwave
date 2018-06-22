package com.multi;

import java.util.concurrent.TimeUnit;

public class Ex_6 {

	public static void printThreadMessage(String message) {
		String threadName = Thread.currentThread().getName();
		System.out.format("%s:  %s%n", threadName, message);
	}

	private static class ProgramLoop implements Runnable {
		@Override
		public void run() {
			//try {
				for (int i = 0; i < 1000; i++) {
					//TimeUnit.SECONDS.sleep(1);
					printThreadMessage(String.valueOf(i));
					if (Thread.interrupted()) {
						printThreadMessage("sir, we r ending...");
						return;
					}

				}
			//} catch (InterruptedException e) {
			//	printThreadMessage("i wasnt done");
			//}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		printThreadMessage("starting ProgramLoop thread");
		Thread thread = new Thread(new ProgramLoop(), "PL");
		thread.start();
		printThreadMessage("Waiting for ProgramLoop thread to finish");

		while (thread.isAlive()) {
			printThreadMessage("Still waiting..");
			thread.join(20);
			if (thread.isAlive()) {
				printThreadMessage("interrupting...");
				thread.interrupt();
				// printThreadMessage("stopping...");
				// thread.stop(); // dont use this
			}

		}
		printThreadMessage("Finally..we r moving to next topic");
	}
}
