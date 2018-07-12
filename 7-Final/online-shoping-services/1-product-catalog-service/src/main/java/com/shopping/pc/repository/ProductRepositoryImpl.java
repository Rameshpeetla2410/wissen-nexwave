package com.shopping.pc.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.shopping.pc.exceptions.ProductNotFoundException;
import com.shopping.pc.model.Product;

//@Component
@Repository
public class ProductRepositoryImpl implements ProductRepository {

	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> find() {
		String jpql = "from Product p";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}

	@Override
	public Product findById(int id) {
		Product product=em.find(Product.class, id);
		if(product==null)
			throw new ProductNotFoundException("Requested product not available");
		return product;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> findByName(String name) {

		// way-1 : using JPQL
		Query query = em.createNamedQuery("findByName");
		query.setParameter("prodName", "%" + name + "%");
		return query.getResultList();


		// way-2 : using Criteria API
		// CriteriaBuilder cb=em.getCriteriaBuilder();
		// CriteriaQuery<Product> cq = cb.createQuery(Product.class);
		// Metamodel m = em.getMetamodel();
		// EntityType<Product> Product_ = m.entity(Product.class);
		// Root<Product> root = cq.from(Product.class);
		// ... 

	}

}
