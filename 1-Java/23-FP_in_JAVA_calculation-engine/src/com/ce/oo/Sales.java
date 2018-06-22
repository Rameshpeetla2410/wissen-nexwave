package com.ce.oo;

public class Sales extends MonthByMonthQuantity {

	public Sales(double[] values) {
		super(values);
	}

	@Override
	public String getName() {
		return "sales";
	}

}
