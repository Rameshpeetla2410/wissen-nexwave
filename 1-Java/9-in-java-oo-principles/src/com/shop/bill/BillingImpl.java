package com.shop.bill;

import com.shop.pm.PriceMatrix;

/*
 * 
 *  design & performance issues
 *  ---------------------------
 *  
 *  ------------------------------------------------------------
 *  -> tight-coupling b/w dependent & dependency impln
 *      => can't extend with new functionality ( strategies )
 *  -> too many dependency instances are created & destroyed on repeated operations
 *  	=> slow, memory/resource consume is high
 *  -> Unit-Testing not possible
 *  	=> dev/bug fix slow
 *  ------------------------------------------------------------
 *  
 *  why these issues are happening here ?
 *  
 *     => dependent itself creating it's own dependency
 *     
 *  soln : ==> don't create dependency in dependent's class , do Lookup
 *  
 *  Limitation on lookup : location tight-coupling
 *  
 *  best-soln : don't create/lookup , inject/get thru 'some-one'/'container' ==> ( IOC ) ==> Inversion of Control
 *  
 *  
 *  how to implement 'IOC' ?
 *     	
 *  
 *  ---------------------------------------------------------------
 *     -> using 'Dependency Injection' 
 *  	
 *  		many ways
 *  
 *  			- constructor DI
 *  	        - setter DI
 *              - field 
 *              - method
 *              
 *  ---------------------------------------------------------------            
 *  
 *    
 */

public class BillingImpl implements Billing {

	private PriceMatrix priceMatrix;

	// public BillingImpl(PriceMatrix priceMatrix) {
	// super();
	// this.priceMatrix = priceMatrix;
	// }

	public void setPriceMatrix(PriceMatrix priceMatrix) {
		this.priceMatrix = priceMatrix;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shop.bill.Billing#getTotalPrice(java.lang.String[])
	 */
	@Override
	public double getTotalPrice(String[] cart) {
		double total = 0.0;
		for (String item : cart) {
			total += priceMatrix.getPrice(item);
		}
		return total;
	}

}
