package com.ex;

class A { /* ... */ }
interface B { /* ... */ }
interface C { /* ... */ }

class D <T extends A & B & C> { /* ... */ }

class E extends A implements B,C{}

public class Ex5 {
	
	public static void main(String[] args) {
		D<E> d=new D<>();
	}

}
