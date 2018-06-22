package com;

import java.util.ArrayList;
import java.util.List;

class Super {
	void abc() {
	}
}

class Sub extends Super {

	@Override
	void abc() {
	}
}

class Lib {
	@Deprecated
	void v1() {
	}

	void v2() {
	}
}

public class Ex {

	public static void main(String[] args) {

		Lib lib = new Lib();
		lib.v1();

		@SuppressWarnings("rawtypes")
		List list = new ArrayList();

	}

}
