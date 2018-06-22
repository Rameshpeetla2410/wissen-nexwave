package com.multi;

class Work implements Runnable {
	public void doWork() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + "-doing work-1");
	}

	@Override
	public void run() {
		doWork();
	}
}

class Worker extends Thread {
	public Worker(String name) {
		super(name);
	}

	public void doWork() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + "-doing work-2");
	}

	@Override
	public void run() {
		doWork();
	}
}

public class Ex_1 {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + "-start");

		// way-1
		// ----------------------------------------------------------------
		Work work = new Work();  // Task
		Thread workerThread = new Thread(work, "A");  // Thread
		workerThread.start();
		// workerThread.run();

		// ----------------------------------------------------------------
		// way-2
		Worker worker = new Worker("B"); // Task + thread
		worker.start();
		// ----------------------------------------------------------------

	}

}
