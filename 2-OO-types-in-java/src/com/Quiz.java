package com;

class Y {
	static int staVar = 1;
	int insVar = 2;

	public static void staMethod() {
		System.out.println(staVar);
		// System.out.println(insVar); // cannot make static reference to non-static
	}

	public void insMethod() {
		System.out.println(staVar);
		System.out.println(insVar);
	}
}

public class Quiz {

	public static void main(String[] args) {

		Y.staMethod();
		new Y().insMethod();

	}

}
