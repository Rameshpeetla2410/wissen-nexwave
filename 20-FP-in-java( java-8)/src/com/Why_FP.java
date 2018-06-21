package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Why_FP {

	public static void main(String[] args) {

		// ------------------------------------
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("A");
		list.add("A");
		list.add("B");
		list.add("A");
		list.add("C");
		list.add("A");
		// ------------------------------------

		// imperative style ( what + how )

		// what ==> remove all 'A' elements
		// how ==> iterate, tale each element to temp var & compare then remove

		// ------------------------------------
		
		// Iterator<String> iterator = list.iterator();
		// while (iterator.hasNext()) {
		// String ele = iterator.next();
		// if (ele.equals("A")) {
		// iterator.remove();
		// }
		// }
		// System.out.println(list);
		// ------------------------------------

		// functional style ( what )

		list.removeIf(ele -> ele.equals("A"));

		// ----------------------------------------

	}

}
