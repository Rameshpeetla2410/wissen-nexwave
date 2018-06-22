package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.model.Product;

public class List_Colln_Practical_Ex {

	public static void main(String[] args) {

		Product product1 = new Product(234234, "Item-1", 1000.00);
		Product product2 = new Product(546346, "Item-2", 4000.00);
		Product product3 = new Product(131234, "Item-3", 3000.00);
		Product product4 = new Product(546456, "Item-4", 6000.00);
		Product product5 = new Product(747547, "Item-5", 2000.00);

		// ---------------------------------------------------------

		List<Product> products = new ArrayList<>();
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);
		products.add(product1);

		// -----------------------------------------------------------
		display(products);
		System.out.println();
		// -----------------------------------------------------------

		Collections.sort(products);

		// -----------------------------------------------------------
		display(products);
		System.out.println();
		// -----------------------------------------------------------

		// way-1
		// Collections.sort(products, new ProductsById());
		// way-2 - anonymous type
		Collections.sort(products, new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				return o1.getId() - o2.getId();
			}
		});
		//way-3 - using Lambda Expression ( in java 8 )
		//Collections.sort(products, (o1,o2)->o1.getId() - o2.getId());

		// -----------------------------------------------------------
		display(products);
		System.out.println();
		// -----------------------------------------------------------

	}

	private static void display(List<Product> products) {
		for (Product product : products) {
			System.out.println(product);
		}
	}

}

class ProductsById implements Comparator<Product> {
	@Override
	public int compare(Product o1, Product o2) {
		return o1.getId() - o2.getId();
	}
}