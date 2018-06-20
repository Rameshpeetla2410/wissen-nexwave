package com.oo.patterns.behavioral;

interface CurrencyDispenser {
	int getValue();

	String dispense(int amount);

	void setNext(CurrencyDispenser currencyDispenser);
}

class TwoThousandDispenser implements CurrencyDispenser {
	private CurrencyDispenser next;

	@Override
	public int getValue() {
		return 2000;
	}

	@Override
	public void setNext(CurrencyDispenser currencyDispenser) {
		this.next = currencyDispenser;
	}

	@Override
	public String dispense(int amount) {
		StringBuilder builder = new StringBuilder();
		int numOfNotes = amount / 2000;
		int n = amount % 2000;
		builder.append("Rs.2000 X " + numOfNotes + "\n");
		if (n != 0 && next != null) {
			String s = next.dispense(n);
			return builder.append(s).toString();
		}
		return builder.toString();
	}
}

class FiveHundredDispenser implements CurrencyDispenser {

	private CurrencyDispenser next;

	@Override
	public int getValue() {
		return 500;
	}

	@Override
	public void setNext(CurrencyDispenser currencyDispenser) {
		this.next = currencyDispenser;
	}

	@Override
	public String dispense(int amount) {
		StringBuilder builder = new StringBuilder();
		int numOfNotes = amount / 500;
		int n = amount % 500;
		builder.append("Rs.500 X " + numOfNotes + "\n");
		if (n != 0 && next != null) {
			String s = next.dispense(n);
			return builder.append(s).toString();
		}
		return builder.toString();
	}

}

class HundredDispenser implements CurrencyDispenser {

	private CurrencyDispenser next;

	@Override
	public int getValue() {
		return 100;
	}

	@Override
	public void setNext(CurrencyDispenser currencyDispenser) {
		this.next = currencyDispenser;
	}

	@Override
	public String dispense(int amount) {
		StringBuilder builder = new StringBuilder();
		int numOfNotes = amount / 100;
		int n = amount % 100;
		builder.append("Rs.100 X " + numOfNotes + "\n");
		if (n != 0 && next != null) {
			String s = next.dispense(n);
			return builder.append(s).toString();
		}
		return builder.toString();
	}

}

class ATM {
	private CurrencyDispenser currencyDispenser;

	public ATM() {
		CurrencyDispenser twoThousandDispenser = new TwoThousandDispenser();
		CurrencyDispenser fiveHundredDispenser = new FiveHundredDispenser();
		CurrencyDispenser hundredDispenser = new HundredDispenser();

//
		hundredDispenser.setNext(fiveHundredDispenser);
		twoThousandDispenser.setNext(hundredDispenser);
		currencyDispenser = twoThousandDispenser;

//		this.currencyDispenser=new TwoThousandDispenser()
//		                       .setNext(hundredDispenser)
//		                       .setNext(fiveHundredDispenser)
	}

	public void withdraw(int amount) {
		String summary = currencyDispenser.dispense(amount);
		System.out.println(summary);
	}
}

public class Chain_Of_Reponsibility_Ex {

	public static void main(String[] args) {

		ATM atm = new ATM();
		atm.withdraw(4500);

	}

}
