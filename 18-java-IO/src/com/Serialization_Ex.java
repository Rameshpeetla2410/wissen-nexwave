package com;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.model.Product;

public class Serialization_Ex {

	public static void main(String[] args) throws IOException {

		Product product = new Product(24234, "laptop", 1000.00);
		
		System.out.println(product instanceof Serializable);
		System.out.println(product.getCompany() instanceof Serializable);

		// ..........

		FileOutputStream fos = new FileOutputStream("prod.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(product);
		oos.close();
		fos.close();
		System.out.println("serialized");

		product = null;

	}

}
