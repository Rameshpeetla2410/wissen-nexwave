package com.ex;

import java.util.List;

interface Skill {
}

class Tech implements Skill {
}

class NonTech implements Skill {
}

class Employee<T extends Skill> {
	T skill;

	public <U extends Number, V extends Number> double printIt(U inp1, V inp2) {
		// System.out.println(inp1);
		// System.out.println(inp2);
		int result = inp1.intValue() + inp2.intValue();
		return result;
	}

	public <V> V echo(V t) {
		return t;
	}

	public void printList(List<? super Integer> list) {

	}
}

public class Ex9 {
	public static void main(String[] args) {
		Employee<Tech> techEmployee = new Employee<>();
		techEmployee.printIt(10, 20);
		techEmployee.printIt(30, 40);
	}

}
