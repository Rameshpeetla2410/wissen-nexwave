package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Product;

public class Save_Product {

	public static void main(String[] args) {

		Product product=new Product(); //  New / Transient
		product.setId(444);
		product.setName("product-4");
		product.setPrice(4000.00);

		// using JPA API
		// ----------------------------------------

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		em.persist(product);  // Managed / Persistent state
		product.setPrice(3000.00);
		product.setPrice(4000.00);

		em.getTransaction().commit();
		em.close();
		emf.close();

		// ----------------------------------------

	}

}
