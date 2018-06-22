package com;

import java.util.function.Consumer;

public class Lambda_Variable_Capture_Ex {

	static int staVar = 1;
	int insVar = 2;

	public Consumer<Integer> getFunc() {
		int loc = 3;
		Consumer<Integer> consumer = arg -> {
			System.out.println(arg);
			System.out.println(loc);
			System.out.println(this.insVar);
			System.out.println(staVar);
		};
		return consumer;
	}

	public static void main(String[] args) {

		Lambda_Variable_Capture_Ex capture_Ex = new Lambda_Variable_Capture_Ex();
		Consumer<Integer> consumer=capture_Ex.getFunc();
		consumer.accept(4);

	}

}
