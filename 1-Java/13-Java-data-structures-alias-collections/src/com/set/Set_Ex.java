package com.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set_Ex {

	public static void main(String[] args) {
//
//		Set<String> set = new TreeSet<>(new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return o2.compareTo(o1);
//			}
//		});
//		 Set<String> set = new HashSet<>();
		 Set<String> set = new LinkedHashSet<>();
		set.add("A");
		set.add("C");
		set.add("B");
		set.add("A");
		set.add("E");
		set.add("Z");
		set.add("P");
		set.add(null);
		set.add(null);

		System.out.println(set);

	}

}
