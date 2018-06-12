package com.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_vs_LinkedList_Ex {

	public static void compare(List<String> list) {
		long start = System.nanoTime();
		for (int i = 0; i < 1000000; i++) {
			list.add("string-" + i);
		}
		long end = System.nanoTime();
		System.out.println(end - start);
	}

	public static void main(String[] args) {

		compare(new ArrayList<>());
		compare(new LinkedList<>());

	}

}
