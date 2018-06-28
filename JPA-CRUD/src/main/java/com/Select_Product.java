package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Product;

/*
 * 
 *  in JAP , we can select entities in 4 ways
 *  
 *   -> by primary key
 *   -> by JPQL
 *   -> by Criteria API
 *   -> by Native SQL
 * 
 */

public class Select_Product {

	public static void main(String[] args) {

		// using JPA API
		// ----------------------------------------

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Product product = em.find(Product.class, 111); // Managed
		System.out.println(product);
		product.setPrice(1500.00);

		em.getTransaction().commit();
		em.close();
		emf.close();

		// ----------------------------------------

	}

}
