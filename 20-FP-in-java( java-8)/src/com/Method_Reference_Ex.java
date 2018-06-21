package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import com.model.Employee;

class FoodLib {
	static String getFood() {
		return " 4pc chapathi + rice";
	}
}

interface ThreadSupplier {
	Thread giveMeAThread();
}

public class Method_Reference_Ex {

	public static void main(String[] args) {

		Supplier<String> supplier1 = () -> {
			// ...
			return " 4pc chapathi + rice";
		};
		Supplier<String> supplier2 = () -> {
			return FoodLib.getFood();
		};
		Supplier<String> supplier3 = () -> FoodLib.getFood();
		Supplier<String> supplier4 = FoodLib::getFood;

		// System.out.println(supplier4.get());

		// ----------------------------------------------------

		// Static method
		Supplier<Thread> s1 = Thread::currentThread;

		// Nothing special about 'Supplier'...
		ThreadSupplier ts = Thread::currentThread;

		// ----------------------------------------------------

		// Instance method (instance specified)
		Employee frank = new Employee("Frank", 3000);
		Supplier<Double> s2 = frank::getSalary;
		// System.out.println(s2.get());

		// A common instance method (instance specified)
		Consumer<String> c1 = System.out::println;
		c1.accept("hello");

		// ----------------------------------------------------

		// An instance method (instance not specified)
		// Function<Employee, Double> function=e->e.getSalary();
		Function<Employee, Double> function = Employee::getSalary;
		System.out.println(function.apply(frank));

		// ----------------------------------------------------

		// A useful application: building a comparator based on a field

		// comparing expects Function<Employee, U>,
		// where U supports natural ordering (i.e., Comparable)
		//
		// Comparator<Employee> byName1 = (e1, e2) ->
		// e1.getName().compareTo(e2.getName());
		// Comparator<Employee> byName2 = Comparator.comparing((e) -> e.getName());
		// Comparator<Employee> byName3 = Comparator.comparing(Employee::getName);

		// ----------------------------------------------------
		//
		// Supplier<List<String>> supplier = ArrayList::new;
		// List<String> list = supplier.get();

	}

}
