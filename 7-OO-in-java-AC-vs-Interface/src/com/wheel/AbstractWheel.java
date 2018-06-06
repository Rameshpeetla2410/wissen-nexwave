package com.wheel;

public abstract class AbstractWheel implements Wheel {
	@Override
	public void safety() {
		System.out.println("MRF safety-impl");
	}
}
