package com.ce.oo;

public class IncrementalCosts extends PolynomialQuantity {

	protected IncrementalCosts(double value, double slope) {
		super(new double[] { value, slope });
	}

	@Override
	public String getName() {
		return "incremental costs";
	}

}
