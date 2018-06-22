package com.ex;

class Util {

	// Type-Level
	public static <T> void printItems(T[] items) {
		for (T item : items) {
			System.out.println(item);
		}
	}

}

public class Ex3 {

	public static void main(String[] args) {

		Util.printItems(new String[] { "idly", "vada", "poori" });
		Util.printItems(new Integer[] { 1, 2, 3 });
		
	}

}
