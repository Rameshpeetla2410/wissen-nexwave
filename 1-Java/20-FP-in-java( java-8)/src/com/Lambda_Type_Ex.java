package com;

interface Adder {
	double add(double d1, double d2);
}

interface Joiner {
	String join(String s1, String s2);
}

class Lib {
	// public static void testAdder(Adder adder) {
	// double d1 = 12;
	// double d2 = 13;
	// double d = adder.add(d1, d2);
	// System.out.println(d);
	// }
	//
	// public static void testJoin(Joiner joiner) {
	// String s1 = "hello";
	// String s2 = "world";
	// String s = joiner.join(s1, s2);
	// System.out.println(s);
	// }

	public static void test(Adder adder) {
		double d1 = 12;
		double d2 = 13;
		double d = adder.add(d1, d2);
		System.out.println(d);
	}

	public static void test(Joiner joiner) {
		String s1 = "hello";
		String s2 = "world";
		String s = joiner.join(s1, s2);
		System.out.println(s);
	}
}

public class Lambda_Type_Ex {
	public static void main(String[] args) {

		// Adder adder = (x, y) -> x + 10 + y + 10;
		// Lib.testAdder(adder);

		Lib.test((double x, double y) -> x + y);
		Lib.test((Joiner) (x, y) -> x + y);
	}
}
