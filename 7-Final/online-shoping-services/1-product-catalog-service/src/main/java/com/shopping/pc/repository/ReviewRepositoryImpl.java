package com.shopping.pc.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shopping.pc.model.Review;

@Repository
@Transactional
public class ReviewRepositoryImpl implements ReviewRepository{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Review save(Review review) {
		return em.merge(review);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Review> findByProduct(int productId) {
		String jpql="from Review r where r.product.id=?";
		Query query=em.createQuery(jpql);
		query.setParameter(0, productId);
		return query.getResultList();
	}

	@Override
	public Review findById(int id) {
		return em.find(Review.class,id);
	}
	
	@Override
	public void delete(int id) {
		em.remove(em.find(Review.class,id));
	}
	
}
