package com.oo.patterns.creational;

//-------------------------------------------------------------
//class Singleton {
//	private final static Singleton singleton = new Singleton(); // eager
//
//	private Singleton() {
//	}
//
//	public static Singleton getSingleton() {
//		return singleton;
//	}
//}

//-------------------------------------------------------------
//
class Singleton {
	private static Singleton singleton = null; // lazy

	private Singleton() {
	}

	public void m1() {
		// ..
	}

	public void m2() {
		// ..
	}

	public static Singleton getSingleton() {
		if (singleton == null)
			singleton = new Singleton();
		return singleton;
	}
}

// -------------------------------------------------------------

public class Singleton_Ex {

	public static void main(String[] args) {

		// module-1
		// -------------------------------------------------
		Singleton singleton1 = Singleton.getSingleton();
		// -------------------------------------------------

		// module-2
		// -------------------------------------------------
		Singleton singleton2 = Singleton.getSingleton();
		// -------------------------------------------------

		System.out.println(singleton1 == singleton2);
	}

}
