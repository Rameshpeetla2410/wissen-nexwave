package com;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.model.Product;

public class De_Serialization_Ex {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("prod.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object object = ois.readObject();
		if (object instanceof Product) {
			Product product = (Product) object;
			System.out.println(product);
		}
		ois.close();
	}

}
