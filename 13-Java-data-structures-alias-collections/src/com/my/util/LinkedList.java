package com.my.util;

import java.util.Iterator;

public class LinkedList<E> implements Iterable<E> {

	private Node head;
	private Node tail;

	public void add(E data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		tail.setNext(newNode);
	}

	public void add(int idx, E data) {
		//
	}

	public E get(int idx) {
		//
		return null;
	}

	public boolean remove(int idx) {
		//
		return false;
	}

	public void reverse() {
		//
	}

	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			@Override
			public boolean hasNext() {
				// ..
				return false;
			}

			@Override
			public E next() {
				// ..
				return null;
			}
		};
	}

	private class Node {
		private E data;
		private Node next;

		public Node(E data) {
			super();
			this.data = data;
		}

		public Node(E data, LinkedList<E>.Node next) {
			super();
			this.data = data;
			this.next = next;
		}

		public E getData() {
			return data;
		}

		public void setData(E data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

}
