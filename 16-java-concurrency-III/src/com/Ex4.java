package com;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Ex4 {
	
	public static void main(String[] args) {
		

		Runnable r = () -> {
			String name = Thread.currentThread().getName();
			System.out.println(name + " Hello");
			try {
				TimeUnit.SECONDS.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " Bye");
		};

		ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
		service.scheduleWithFixedDelay(r, 3, 3, TimeUnit.SECONDS);
		
	}

}
