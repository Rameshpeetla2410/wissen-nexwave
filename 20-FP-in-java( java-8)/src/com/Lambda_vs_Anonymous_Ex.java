package com;

import java.util.function.Consumer;

public class Lambda_vs_Anonymous_Ex {

	public static void main(String[] args) {

		// Anonymous class, multiple instances
		System.out.println("\nAnonymous class:");
		for (int i = 0; i < 5; i++) {
			Consumer<String> printer1 = new Consumer<String>() {
				@Override
				public void accept(String msg) {
					System.out.println("Consuming " + msg);
				}
			};
			printer1.accept(printer1.toString());
		}

		// Non-capturing lambda, one instance
		System.out.println("\nNon-capturing lambda:");
		for (int i = 0; i < 5; i++) {
			Consumer<String> printer2 = msg -> System.out.println("Consuming " + msg);
			printer2.accept(printer2.toString());
		}
		

		// Constant-capturing lambda, one instance
		System.out.println("\nConstant-capturing lambda:");
		final int secret = 42;
		for (int i=0; i<5; i++) {
			Consumer<String> myPrinter3 =
					msg -> System.out.println("Consuming " + msg + ", " + secret);
			
			myPrinter3.accept(myPrinter3.toString());
		}

		
		new Lambda_vs_Anonymous_Ex().foo();
		
	}
	
	private int id = 1;
	public void foo() {
		System.out.println("\nInstance-capturing lambda:");
		
		for (int i=0; i<5; i++) {
			// this-capturing lambda, many instances!
			Consumer<String> myPrinter4 =
					msg -> System.out.println("Consuming " + msg + ", ");
			
			myPrinter4.accept(myPrinter4.toString());
		}
	}

}
