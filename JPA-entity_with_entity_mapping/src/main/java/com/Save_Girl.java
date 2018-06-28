package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Girl;


public class Save_Girl {

	public static void main(String[] args) {

		// using JPA API
		// ----------------------------------------

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Girl girl=new Girl(222,"girl-1");
		em.persist(girl);

		em.getTransaction().commit();
		em.close();
		emf.close();

		// ----------------------------------------

	}

}
