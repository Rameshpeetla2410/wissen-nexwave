package com.ex;

import java.util.Scanner;

public class Arith_Ex {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter num-1");
		int n1 = scanner.nextInt();

		System.out.println("Enter num-2");
		int n2 = scanner.nextInt();

		// step-1 : add
		System.out.println("1.add");

		// step-2 : sub
		System.out.println("2.sub");

		try {
			// step-3 : div
			System.out.println("3.div");
			int r = n1 / n2;
			System.out.println("divide cant happen");
		} catch (ArithmeticException e) {
			// handling code
			/*
			 *  -> report to end-user , with friendly message
			 *  -> log the exception in log-file , for future fix
			 *  -> close , any external resource which are opened
			 *  -> re-throw exception to other modules
			 */
			System.out.println("Ex:"+e.getMessage());
		}

		// step-4 : mul
		System.out.println("4.Mul");

		scanner.close();
		System.out.println("happy with this app");
	}

}
