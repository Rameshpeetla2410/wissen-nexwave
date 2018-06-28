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

public class Update_Product {

	public static void main(String[] args) {

		// using JPA API
		// ----------------------------------------

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");

		// Req-1
		EntityManager em =
				emf.createEntityManager();
		em.getTransaction().begin();
		Product product = em.find(Product.class, 111);
		em.getTransaction().commit();
		em.close();

		System.out.println("----------------------------");
		product.setPrice(200.00);
		System.out.println("----------------------------");
		// Req-2
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(product);
		em.getTransaction().commit();
		em.close();

		emf.close();

		// ----------------------------------------

	}

}
