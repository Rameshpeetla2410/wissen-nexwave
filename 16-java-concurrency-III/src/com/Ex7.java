package com;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Ex7 {

	public static void main(String[] args) throws InterruptedException {

		Semaphore semaphore = new Semaphore(3);

		Runnable sleepTask = () -> {
			try {
				semaphore.acquireUninterruptibly();
				String name = Thread.currentThread().getName();
				System.out.println(name + " going to sleep in bed of 3");
				TimeUnit.SECONDS.sleep(5);
				System.out.println(name + " leaving the bed");
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaphore.release();
			}
		};

		ExecutorService service = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			service.execute(sleepTask);
		}

		TimeUnit.SECONDS.sleep(1);

		int len = semaphore.getQueueLength();
		System.out.println(len);
	}

}
