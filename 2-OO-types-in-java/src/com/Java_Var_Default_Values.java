package com;

class X {
	static int staVar;
	String insVar;

	void method() {
		int loc = 0;
		System.out.println(loc);
	}
}

public class Java_Var_Default_Values {
	public static void main(String[] args) {
		System.out.println(X.staVar);
		System.out.println(new X().insVar);
		new X().method();
	}
}
