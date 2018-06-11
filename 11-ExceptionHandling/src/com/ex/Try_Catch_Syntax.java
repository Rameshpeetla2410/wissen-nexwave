package com.ex;

class Employee {
	public void doWork() {
		System.out.println("emp work..");
	}
}

public class Try_Catch_Syntax {

	public static void main(String[] args) {

		System.out.println("A");
		try {
			System.out.println("B");
			try {
				int ari = 1 / 0;
			} catch (ArithmeticException e) {
				System.out.println("Arith Ex :" + e.getMessage());
			}
			int[] arr = { 10, 20 };
			System.out.println(arr[1]);
			Employee employee = null;
			employee.doWork();
			System.out.println("C");
		}
		// catch (ArithmeticException e) {
		// System.out.println("Arith Ex :" + e.getMessage());
		// }
		// catch (ArrayIndexOutOfBoundsException e) {
		// System.out.println("Array Ex :" + e.getMessage());
		// }
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Arit | Arra Ex : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Ex :" + e.getMessage());
		}
		System.out.println("D");

	}

}
