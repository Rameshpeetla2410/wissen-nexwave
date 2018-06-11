package com.ex;

import java.util.ArrayList;
import java.util.List;

public class Ex8 {

	// Upper Bounded wildcards
	public static double sumOfList(List<? extends Number> list) {
		double s = 0.0;
		for (Number n : list)
			s += n.doubleValue();
		return s;
	}

	// Unbounded Wildcards
	public static void printList(List<?> list) {
		for (Object elem : list)
			System.out.println(elem + " ");
		System.out.println();
	}

	/*
	 * Integer <-- Number <--- Object
	 * 
	 */
	public static void addNumbers(List<? super Integer> list) {
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
	}

	public static void main(String[] args) {

		// List<Integer> li = Arrays.asList(1, 2, 3);
		// System.out.println("sum = " + sumOfList(li));

		// List<Integer> li = Arrays.asList(1, 2, 3);
		// List<String> ls = Arrays.asList("one", "two", "three");
		// printList(li);
		// printList(ls);
		//
		// List<Number> numbers = new ArrayList<>();
		// System.out.println(numbers);

	}

}
