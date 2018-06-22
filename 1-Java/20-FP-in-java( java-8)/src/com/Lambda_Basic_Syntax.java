package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda_Basic_Syntax {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.add("hello");
		strings.add("world");
		strings.add("bye");

		Collections.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		// or
		Collections.sort(strings, (String o1, String o2) -> {
			return o2.compareTo(o1);
		});
		// or
		Collections.sort(strings, (o1, o2) -> {
			return o2.compareTo(o1);
		});
		// or
		Collections.sort(strings, (o1, o2) -> o2.compareTo(o1));

	}

}
