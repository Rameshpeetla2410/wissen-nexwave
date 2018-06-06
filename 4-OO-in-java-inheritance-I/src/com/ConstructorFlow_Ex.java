package com;

class A extends Object {
	public A(int v) {
		super();
		System.out.println("im A");
	}

}

class B extends A {
	public B(int v) {
		super(v);
		System.out.println("im B");
	}
}

class C extends B {
	public C(int v) {
		super(v);
		System.out.println("im C");
	}
}

public class ConstructorFlow_Ex {

	public static void main(String[] args) {
		C c = new C(100);

	}

}
