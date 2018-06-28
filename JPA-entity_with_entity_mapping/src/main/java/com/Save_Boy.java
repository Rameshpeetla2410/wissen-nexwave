package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Boy;
import com.model.Girl;

public class Save_Boy {

	public static void main(String[] args) {

		// using JPA API
		// ----------------------------------------

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Boy boy = new Boy(113, "boy-3");
		Girl girl = new Girl(224, "girl-3");
		boy.setGirl(girl);
		em.persist(boy);
		//em.persist(girl);

		em.getTransaction().commit();
		em.close();
		emf.close();

		// ----------------------------------------

	}

}
