package com;

/*
 *----------------------------------------------------------
 *  type-casting
 *----------------------------------------------------------  
 *   1. primitive
 *   	 a. implicit
 *   	 b. explicit	
 *   2. reference
 *   	 a. implicit
 *   	 b. explicit
 *---------------------------------------------------------- 
 */

class V {
}

class C extends V {
}

class B extends V {
}

public class TypeCasting_Ex {

	public static void main(String[] args) {

		// -------------------------------------------------------
		// why we need type-casting ?
		//
		// int a = 6;
		// int b = 4;
		// float c = (float)a / b;
		// System.out.println(c);

		// -------------------------------------------------------

		// primitive-casting

		// byte a = 12;
		// int b = a; // implicit casting ( done by runtime )
		// a = (byte) b; // explicit casting ( done by you )
		//
		// --------------------------------------------------------

		// Quiz
		// int i = 456;
		// byte b =(byte) i;
		// System.out.println(b);

		// ----------------------------------------------------------
		// Reference casting

		// #1
		// C c=new C();
		// V v=c; // implicit casting
		//
		//
		// V v = new B();
		// if (v instanceof C) {
		// C c = (C) v; // explicit casting
		// }

	}

}
