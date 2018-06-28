package com;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Address;
import com.model.Employee;

public class DAO_Ex {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setId(123);
		employee.setName("Ria");

		Address address = new Address();
		address.setCity("BLR");
		address.setCountry("IN");

		Address homeAddress = new Address();
		homeAddress.setCity("CHN");
		homeAddress.setCountry("IN");

		employee.setAddresses(Arrays.asList(address, homeAddress));

		// using JPA API
		// ----------------------------------------

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		em.persist(employee);

		em.getTransaction().commit();
		em.close();
		emf.close();

		// ----------------------------------------

	}

}
