package com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

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
 *   -----------------------------------------------------
 *   
 *   limitations with SQL
 *   
 *   
 *    --> DBMS dependent i.e its works on structure
 *    --> uses Table & column names to query data
 *    
 *   advantages of JPQL
 *   --------------------
 *   
 *   --> OO based
 *   --> DBMS independent
 *   
 *   
 *   ----------------------------------------------------- 
 *    
 * 
 */

public class Select_Product {

	public static void main(String[] args) {

		// using JPA API
		// ----------------------------------------

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		// ---------------------------------------------------
		// String price = "2000.00 or 1=1";// ==> SQL Injection possible
		// Query query = em.createQuery("from Product p where p.price=:pPrice");

		// query.setFirstResult(0);
		// query.setMaxResults(2);

		// query.setParameter("pPrice", Double.parseDouble("2000.00"));

		// List<Product> products = query.getResultList();
		// for (Product product : products) {
		// System.out.println(product);
		// }

		// ---------------------------------------------------
		//
		// String jpql = "select new list(p.name,p.price) from Product p";
		// Query query = em.createQuery(jpql);
		// List<ProductSummary> list = query.getResultList();
		//
		// for (ProductSummary ps : list) {
		// System.out.println(ps.getName() + "-"+ps.getPrice());
		// }

		// ---------------------------------------------------
		//
		// CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		// CriteriaQuery<Object> criteriaQuery = criteriaBuilder.createQuery();
		// Root<Product> from = criteriaQuery.from(Product.class);
		//
		// System.out.println("Select all records");
		// CriteriaQuery<Object> select = criteriaQuery.select(from);
		// TypedQuery<Object> typedQuery = em.createQuery(select);
		// List<Object> resultlist = typedQuery.getResultList();
		//
		// for (Object o : resultlist) {
		// Product p = (Product) o;
		// System.out.println(p);
		// }
		//
		// CriteriaQuery<Object> select1 = criteriaQuery.select(from);
		// select1.orderBy(criteriaBuilder.desc(from.get("name")));
		// TypedQuery<Object> typedQuery2 = em.createQuery(select1);
		// List<Object> resultlist2 = typedQuery2.getResultList();
		//
		// for (Object o : resultlist2) {
		// Product p = (Product) o;
		// System.out.println(p);
		// }

		// --------------------------------------------------

//		Query query = em.createNamedQuery("Product.findAll");
//		List<Product> products = query.getResultList();
//		for (Product product : products) {
//			System.out.println(product);
//		}
		
		//---------------------------------------------------
		

		Query query = em.createNamedQuery("Product.all");
		List<Product> products = query.getResultList();
		for (Product product : products) {
			System.out.println(product);
		}
		
		//----------------------------------------------------

		em.getTransaction().commit();
		em.close();
		emf.close();

		// ----------------------------------------

	}

}
