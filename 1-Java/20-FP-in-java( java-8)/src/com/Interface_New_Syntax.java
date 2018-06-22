package com;

import java.util.Comparator;

import com.model.Employee;

interface Scalable {
	// implicitly public abstract
	void setScale(double scale);

	// implicitly public static final
	double DEFAULT_SCALE = 1.0;

	// implicitly public
	default void resetScale() {
		setScale(DEFAULT_SCALE);
	}

	// implicitly public
	static boolean isScalable(Object obj) {
		return obj instanceof Scalable;
	}
}

class Box implements Scalable {
	@Override
	public void setScale(double scale) {
		// ....
	}
}

public class Interface_New_Syntax {
	public static void main(String[] args) {

		// Box box = new Box();
		// box.resetScale();
		// System.out.println(Scalable.isScalable(box));

		// --------------------------------------------------------

		Employee mike = new Employee("Mike", 2000), louise = new Employee("Louise", 2500);

		Comparator<Employee> byName = new Comparator<Employee>() {
			public int compare(Employee a, Employee b) {
				return a.getName().compareTo(b.getName());
			}
		};
		// -------------------------------------------------------------
		// System.out.println("By name:");
		// System.out.println(byName.compare(mike, louise));
		// Comparator<Employee> byNameReversed=byName.reversed();
		// System.out.println(byNameReversed.compare(mike, louise));
		//
		// -------------------------------------------------------------
		// a static method in Comparator
		// Comparator<Employee> byNameThenNull = Comparator.nullsLast(byName);
		// System.out.println("Then null:");
		// System.out.println(byNameThenNull.compare(mike, louise));
		// System.out.println(byNameThenNull.compare(mike, null));
		// --------------------------------------------------------------

	}

}
