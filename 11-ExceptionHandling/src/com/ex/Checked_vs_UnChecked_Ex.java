package com.ex;

// module-1
//--------------------------------------------------
class Module1 {
	public void m1() throws Exception {
		System.out.println("Module :: m1()");
		int v = 100;
		if (v == 100)
			throw new Exception("ex from module-1 :: m1()");
	}
}
// --------------------------------------------------

// module-2
// --------------------------------------------------
class Module2 {
	public void m2() throws Exception {
		Module1 module1 = new Module1();
		module1.m1();
		System.out.println("Module :: m2()");
	}
}
// --------------------------------------------------

public class Checked_vs_UnChecked_Ex {

	public static void main(String[] args) {

		try {
			Module2 module2 = new Module2();
			module2.m2();
		} catch (Exception e) {
			System.out.println("Exception Handled at main()");
			System.out.println(e.getMessage());
		}

	}

}
