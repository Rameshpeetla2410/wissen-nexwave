package com.single;

import java.util.Scanner;

class Task1 {
	public void doTask1() {
		System.out.println("Task-1 - begin");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter ur Name ?");
		String name = scanner.nextLine();
		System.out.println("Hello " + name);
		System.out.println("Task-1 - ends");
		scanner.close();
	}
}

class Task2 {
	public void doTask2() {
		System.out.println("Task-2 - begin");
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		System.out.println("Task-2 - ends");
	}
}

public class Single_Thread_Appln {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName() + " start");

		// step-1
		Task1 task1 = new Task1();
		task1.doTask1();
		System.out.println();
		// step-2
		Task2 task2 = new Task2();
		task2.doTask2();
		// step-n...

		System.out.println(Thread.currentThread().getName() + " stop");

	}

}
