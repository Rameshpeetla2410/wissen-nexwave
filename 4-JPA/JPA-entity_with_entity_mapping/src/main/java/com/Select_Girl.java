package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Girl;


public class Select_Girl {

	public static void main(String[] args) {

		// using JPA API
		// ----------------------------------------

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Girl girl=em.find(Girl.class, 223);
		System.out.println(girl);
		System.out.println(girl.getBoy());

		em.getTransaction().commit();
		em.close();
		emf.close();

		// ----------------------------------------

	}

}
