package com.shop;

import com.shop.bill.Billing;
import com.shop.bill.BillingImpl;
import com.shop.pm.PriceMatrix;
import com.shop.pm.PriceMatrixImpl_v1;
import com.shop.pm.PriceMatrixImpl_v2;

public class App {

	public static void main(String[] args) {

		// init
		// -------------------------------------
		PriceMatrix priceMatrixV1 = new PriceMatrixImpl_v1();
		PriceMatrix priceMatrixV2 = new PriceMatrixImpl_v2();
		Billing billing = new BillingImpl();
		billing.setPriceMatrix(priceMatrixV2);
		// -------------------------------------

		// use
		// -------------------------------------
		String[] cart = { "345345", "346345" };
		double totalPrice = billing.getTotalPrice(cart);
		System.out.println("Total : " + totalPrice);
		// -------------------------------------

		// destroy
		// -------------------------------------
		// ............
		// -------------------------------------
	}

}
