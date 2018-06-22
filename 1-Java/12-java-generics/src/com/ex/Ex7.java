package com.ex;

import java.util.ArrayList;
import java.util.List;

public class Ex7 {

	public static void main(String[] args) {

		Object someObject = new Object();
		Integer someInteger = new Integer(10);
		someObject = someInteger; // OK

		List<Number> numberList = new ArrayList<Number>();
		List<Integer> integerList = new ArrayList<Integer>();
		// numberList=integerList; // Error

		class A {
		}
		class B extends A {
		}

		B b = new B();
		A a = b;

		List<B> lb = new ArrayList<>();
		// java.util.List<A> la = lb; // Error

		List<Integer> intList = new ArrayList<>();
		List<? extends Number> numList = intList;

		// List<Integer>[] array = new ArrayList<Integer>[10];// does not compile
	}

}
