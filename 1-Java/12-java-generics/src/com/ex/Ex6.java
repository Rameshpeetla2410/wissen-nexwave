package com.ex;

class NewBox<T> {

	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public <U extends Number> void inspect(U u) {
		System.out.println("T: " + t.getClass().getName());
		System.out.println("U: " + u.getClass().getName());
	}
}

public class Ex6 {

	public static void main(String[] args) {
		NewBox<Integer> integerBox = new NewBox<Integer>();
		integerBox.set(100);
		integerBox.inspect(12.12);
		System.out.println();
		NewBox<String> stringBox = new NewBox<>();
		stringBox.set("hello");
		stringBox.inspect(100L);
	}

}
