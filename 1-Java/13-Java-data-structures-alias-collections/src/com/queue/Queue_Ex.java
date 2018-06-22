package com.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Ex {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();
		queue.add("chapathi");
		queue.add("rice-1");
		queue.add("rice-2");
		queue.add("sweet");

		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}

		Queue<String> queue2 = new PriorityQueue<>();
		queue2.add("B");
		queue2.add("A");
		queue2.add("C");

		while (!queue2.isEmpty()) {
			System.out.println(queue2.poll());
		}

		Deque<String> deque = new LinkedList<>();

	}

}
