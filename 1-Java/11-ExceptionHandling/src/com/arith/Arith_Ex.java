package com.arith;

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

		// step-3 : div
		if (n2 != 0) {
			System.out.println("3.div");
			int r = n1 / n2;
		} else {
			System.out.println("divide cant happen");
		}

		// step-4 : mul
		System.out.println("4.Mul");

		scanner.close();
		System.out.println("happy with this app");
	}

}
