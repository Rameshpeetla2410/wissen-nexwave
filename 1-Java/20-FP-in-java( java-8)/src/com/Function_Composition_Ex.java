package com;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;

import com.model.Employee;

public class Function_Composition_Ex {

	public static void main(String[] args) throws FileNotFoundException {

		// IntPredicate intPredicate1 = n -> {
		// System.out.println("applying intPredicate1");
		// return n > 100;
		// };
		// IntPredicate intPredicate2 = n -> {
		// System.out.println("applying intPredicate2");
		// return n < 200;
		// };
		// IntPredicate intPredicate = intPredicate1.or(intPredicate2);
		//
		// if (intPredicate.test(150)) {
		// System.out.println("Yes");
		// } else {
		// System.out.println("No");
		// }

		// -------------------------------------------------------------

		// - Objective: Writing the same string to screen and to a file

		PrintWriter writer = new PrintWriter("filename.txt");

		Consumer<String> screener = System.out::println;
		Consumer<String> logger = writer::println;
		Consumer<String> both = screener.andThen(logger);

		// both.accept("Program started");
		// writer.close();

		// -------------------------------------------------------------

		// - Objective : Get the initial leter of an Employee's name

		Function<Employee, String> getName = Employee::getName;
		Function<String, Character> getFirstLetter = name -> name.charAt(0);

		// Function<Employee,Character> initial=getName.andThen(getFirstLetter);
		Function<Employee, Character> initial = getFirstLetter.compose(getName);
		System.out.println(initial.apply(new Employee("Nag", 1000.00)));

		// ---------------------------------------------------------------

		// - Objective: compare Employees by name , then by salary

		Comparator<Employee> byName = Comparator.comparing(Employee::getName);
		Comparator<Employee> bySalary = Comparator.comparing(Employee::getSalary);
		Comparator<Employee> byNameAndSalary = byName.thenComparing(bySalary.reversed());

		// --------------------------------------------------------------------

	}

}
