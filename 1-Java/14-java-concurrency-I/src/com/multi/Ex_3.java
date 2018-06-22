package com.multi;

import java.util.concurrent.TimeUnit;

public class Ex_3 {

	public static void main(String[] args) throws InterruptedException {

		String[] items = { "veg-biryani", "egg-biryani", "thali" };

		for (String item : items) {
			// Thread.sleep(3000);
			TimeUnit.SECONDS.sleep(3);
			System.out.println(item);
		}

	}

}
