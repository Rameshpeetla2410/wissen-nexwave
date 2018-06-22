package com.multi;

import java.util.concurrent.TimeUnit;

public class Ex_5 {
	public static void main(String[] args) {

		Runnable tnrWork = new Runnable() {
			@Override
			public void run() {
				System.out.println("tnr : looking code");
				try {
					TimeUnit.SECONDS.sleep(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("tnr : resolved");
			}
		};

		Runnable codeWork = new Runnable() {
			@Override
			public void run() {
				Thread thread = Thread.currentThread();
				String name = thread.getName();
				System.out.println(name + " - doing code");
				System.out.println(name + " - got doubt");

				Thread tnrThread = new Thread(tnrWork);
				tnrThread.start();
				try {
					tnrThread.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println(name + " - thanks for solution. ill proceed further");
			}
		};

		Thread empThread = new Thread(codeWork, "wissen");
		empThread.start();

	}
}
