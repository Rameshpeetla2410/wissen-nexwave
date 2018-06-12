package com.list;

import java.util.ArrayList;
import java.util.List;

public class List_Colln_Methods_Ex {

	public static void main(String[] args) {

		// List<String> list = new ArrayList<>();
		// list.add("string-1");
		// System.out.println(list.get(0));
		// list.set(0, "hello");
		// list.remove(0);
		//
		// System.out.println(list.isEmpty());
		// list.add(0, "hi");
		// System.out.println(list.contains("hi"));
		// System.out.println(list.size());

		List<String> sheet1 = new ArrayList<>();
		sheet1.add("A");
		sheet1.add("B");
		sheet1.add("C");

		List<String> sheet2 = new ArrayList<>();
		sheet2.add("C");
		sheet2.add("D");
		sheet2.add("E");

		// sheet1.removeAll(sheet2);
		sheet1.retainAll(sheet2);
		System.out.println(sheet1);

	}
}
