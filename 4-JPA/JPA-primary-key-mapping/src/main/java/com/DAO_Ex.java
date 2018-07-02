package com;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Employee;
import com.model.EmployeeID;
import com.model.Gender;

public class DAO_Ex {

	public static void main(String[] args) {

		Employee employee = new Employee();
		// employee.setId(123);
		
		EmployeeID employeeID = new EmployeeID();
		employeeID.setEmpID(111);
		employeeID.setDepName("IT");
		
		employee.setEmployeeId(employeeID);
		employee.setName("Ria");
		employee.setGender(Gender.FEMALE);
		employee.setDob(new Date());

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
