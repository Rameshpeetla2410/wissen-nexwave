package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Boy;


public class Select_Boy {

	public static void main(String[] args) {

		// using JPA API
		// ----------------------------------------

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Boy boy=em.find(Boy.class, 112);
		System.out.println(boy);
		System.out.println("-----------------------------");
		System.out.println(boy.getGirl());

		em.getTransaction().commit();
		em.close();
		emf.close();

		// ----------------------------------------

	}

}
