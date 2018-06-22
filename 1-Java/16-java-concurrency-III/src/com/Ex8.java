package com;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex8 {

	public static void main(String[] args) {

		CyclicBarrier cyclicBarrier = new CyclicBarrier(12);

		Runnable doProgramTaskAndLunch = () -> {
			String name = Thread.currentThread().getName();
			System.out.println(name + " -> start doing code");
			try {
				TimeUnit.SECONDS.sleep((int) (Math.random() * 10));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " -> finised code");
			try {
				cyclicBarrier.await();
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
			System.out.println(name + " -> can go to lunch");
		};

		ExecutorService service = Executors.newFixedThreadPool(12);
		for (int i = 0; i < 12; i++) {
			service.submit(doProgramTaskAndLunch);
		}

		service.shutdown();

	}

}
