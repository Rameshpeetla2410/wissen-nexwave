package com.ex;

import java.util.ArrayList;
import java.util.List;

class LT {

}

class Hu extends LT {
}

class An extends LT {
}

public class Ex10 {

	public static void main(String[] args) {

		List<? extends LT> list1 = new ArrayList<Hu>();
		list1 = new ArrayList<An>();

	}

}
