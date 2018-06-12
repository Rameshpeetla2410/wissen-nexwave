package com.list;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Iterator_Pattern_Ex {

	public static void main(String[] args) {

		List<String> list = List.of("A", "B", "D", "C", "E", "A");

		// way-1 : traditional loop
		// for (int i = 0; i < list.size(); i++) {
		// System.out.println(list.get(i));
		// }

		// way-2 : iterator pattern
		// Iterator<String> iterator = list.iterator();
		// while (iterator.hasNext()) {
		// System.out.println(iterator.next());
		// }

		// way-3 : list-iterator
		// ListIterator<String> listIterator = list.listIterator();
		// while (listIterator.hasNext()) {
		// String string = (String) listIterator.next();
		// System.out.println(string);
		// }
		// System.out.println();
		// while (listIterator.hasPrevious()) {
		// System.out.println(listIterator.previous());
		// }

		// way-4 : for-each loop ( can work with any iterable objects )
		for (String item : list) {
			System.out.println(item);
		}

	}

}
