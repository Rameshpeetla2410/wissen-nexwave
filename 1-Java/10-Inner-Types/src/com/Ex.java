package com;

class Outer {

	public static int outPubSta = 1;
	private int outPriIns = 2;

	public Outer() {
	}

	public static void outStaMethod() {
		System.out.println(outPubSta);
	}

	public void outInsMethod() {
		System.out.println(outPubSta);
		System.out.println(outPriIns);

		ClassInner classInner = new ClassInner();
		classInner.inInsMethod();

		Inner inner = new Inner();
		inner.inInsMethod();
	}

	private static class ClassInner {
		public static int inPubSta = 1;
		private int inPriIns = 2;

		public void inInsMethod() {
			System.out.println(inPubSta);
			System.out.println(inPriIns);
		}
	}

	private class Inner {
		private int inPriIns = 2;

		public void inInsMethod() {
			System.out.println(outPubSta);
			System.out.println(outPriIns);
			System.out.println(inPriIns);
		}
	}

}

interface Strategy {
	void get();
}
//
// class FCFS implements Strategy {
// @Override
// public void get() {
//
// }
// }

class Base {
	void m() {
	}
}

public class Ex {
	public static void main(String[] args) {
		int localVar = 12;

		// -------------------------------------------
		class LocalInner {
			static final int sta = 1;
			int ins = 2;

			void insMethod() {
				System.out.println(sta);
				System.out.println(ins);
				System.out.println(localVar);
			}
		}
		LocalInner inner = new LocalInner();
		inner.insMethod();

		// Anonymous inner class
		// -------------------------------------------
		Strategy fcfs = new Strategy() {
			@Override
			public void get() {
				System.out.println();
			}
		};
		Strategy ltfs = new Strategy() {
			@Override
			public void get() {

			}
		};
		// -------------------------------------------
		Base base = new Base() {
			@Override
			void m() {
			}
		};
		base.m();
		// --------------------------------------------

	}
}
