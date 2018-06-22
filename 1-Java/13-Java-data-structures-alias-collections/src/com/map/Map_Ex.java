package com.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Map_Ex {

	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<>();
		map.put(123, "java");
		map.put(321, "js");
		map.put(12, "python");

		// System.out.println(map.get(123));

		// ----------------------------------------------

		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			System.out.println(key + "\t" + map.get(key));
		}

		map.forEach((key, value) -> {
			System.out.println(key + "\t" + value);
		});

	}

}
