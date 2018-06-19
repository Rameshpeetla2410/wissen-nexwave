package com;

import java.util.concurrent.TimeUnit;

public class Producer_Concumer_Pattern_Ex {

	private static Object lock = new Object();

	private static int[] buffer;
	private static int count;

	static boolean isEmpty(int[] buffer) {
		return count == 0;
	}

	static boolean isFull(int[] buffer) {
		return count == buffer.length;
	}

	static class Producer {

		void produce() {
			synchronized (lock) {
				if (isFull(buffer)) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				int v = (int) (Math.random() * 100);
				buffer[count++] = v;
				System.out.println("produced.." + v);
				lock.notifyAll();
			}
		}
	}

	static class Consumer {

		void consume() {
			synchronized (lock) {
				if (isEmpty(buffer)) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				int v = buffer[--count];
				buffer[count] = 0;
				String name = Thread.currentThread().getName();
				System.out.println(name + " consumed.." + v);
				lock.notify();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		buffer = new int[10];
		count = 0;

		Producer producer = new Producer();
		Consumer consumer = new Consumer();

		Runnable produceTask = () -> {
			for (int i = 0; i < 50; i++) {
				producer.produce();
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Done producing");
		};

		Runnable consumeTask = () -> {
			for (int i = 0; i < 45; i++) {
				consumer.consume();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Done consuming");
		};

		Thread producerThread = new Thread(produceTask);
		Thread consumerThread = new Thread(consumeTask, "C1");

		consumerThread.start();
		producerThread.start();

		consumerThread.join();
		producerThread.join();

		System.out.println("Data in the buffer: " + count);
	}

}
