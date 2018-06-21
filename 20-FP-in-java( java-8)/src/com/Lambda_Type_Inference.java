package com;

import java.util.function.UnaryOperator;

import com.model.Employee;
import com.model.Manager;

public class Lambda_Type_Inference {

	public static void main(String[] args) {

		// *** Part 1: identify the FI

		// Standard syntax
		// Consumer<String> c1 = msg -> System.out.println(msg.length());

		// Compile-time error: not enough info
		// Object x1 = msg -> System.out.println(msg.length());

		// Compile-time error: not enough info
		// Object x2 = (String msg) -> System.out.println(msg.length());

		// OK: cast added
		// Object x3 = (Consumer<String>) ((String msg) ->System.out.println(msg.length()));
		

		// *** Part 2: identify parameter types

		
		// OK: but inferred parameter type is Object
		// Consumer<?> c2 = msg -> System.out.println(msg);
		

		// Compile-time error: Inference is *not* based on body of lambda
		// Consumer<?> c3 = msg -> System.out.println(msg.length());
		

		// OK: added manifest type to parameter
		//Consumer<?> c4 = (String msg) -> System.out.println(msg.length());
		
		main2();
		
	}
	

	public static <T extends Employee> T testWithNull(UnaryOperator<T> transformer) {
		return transformer.apply(null);
	}
	
	public static void main2() {	
		// *** Part 2: on the parameter type of lambdas
		
		// Doubles the bonus of a Manager
		UnaryOperator<Manager> doubleBonus = manager ->
			new Manager(manager.getName(), manager.getSalary(), 2*manager.getBonus());
		
		// Compile-time error: Inference is not based on body of lambda
//			Employee test3 = testWithNull(manager ->
//			new Manager(manager.getName(), manager.getSalary(), 2*manager.getBonus()));
	}
	

}
