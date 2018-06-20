package com;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex1 {

	public static void main(String[] args) {

		BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(5);

		Runnable producer = () -> {
			for (int i = 0; i < 10; i++) {
				try {
					System.out.println("producing.." + i);
					blockingQueue.put("item " + i);
					System.out.println("produced..." + i);
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Runnable consumer = () -> {
			for (int i = 0; i < 10; i++) {
				try {
					System.out.println("consuming..");
					String element = blockingQueue.take();
					System.out.println("consumed--" + element);
					TimeUnit.SECONDS.sleep(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(producer);
		service.execute(consumer);

		service.shutdown();

	}

}
