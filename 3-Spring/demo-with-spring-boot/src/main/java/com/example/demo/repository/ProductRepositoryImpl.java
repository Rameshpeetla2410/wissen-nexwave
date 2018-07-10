package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;

@Repository(value="productRepo")
public class ProductRepositoryImpl implements ProductRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Product> findAll() {
		return em.createQuery("from Product").getResultList();
	}
}
