package com;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Ex2 {

	public static void main(String[] args) {

		Callable<String> task = () -> {
			TimeUnit.MILLISECONDS.sleep(3000);
			return "im in thread " + Thread.currentThread().getName();
			// throw new IllegalStateException("illegal state");
		};

		ExecutorService service = Executors.newFixedThreadPool(4);
		

		try {
			for (int i = 0; i < 10; i++) {
				Future<String> future = service.submit(task);
				System.out.println("i Get " + future.get(1000,TimeUnit.MILLISECONDS));
			}
		} catch (ExecutionException| InterruptedException e) {
			System.out.println(e.getMessage());
		} catch (TimeoutException e) {
			e.printStackTrace();
		}

		
	}

}
