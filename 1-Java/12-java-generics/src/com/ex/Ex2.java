package com.ex;

// Type-Level 

class MyList<E> {
	private Object[] items = new Object[10];

	public void add(E e) {
		items[0] = e;
	}

	@SuppressWarnings("unchecked")
	public E get(int idx) {
		return (E) items[idx];
	}
}

public class Ex2 {

	public static void main(String[] args) {
		MyList<String> stringList = new MyList<>();
	}

}
