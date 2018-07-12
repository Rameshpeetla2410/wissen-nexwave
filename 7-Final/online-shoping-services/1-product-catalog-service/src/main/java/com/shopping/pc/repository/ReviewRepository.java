package com.shopping.pc.repository;

import java.util.List;

import com.shopping.pc.model.Review;

public interface ReviewRepository {
	Review save(Review review);
	List<Review> findByProduct(int productId);
	Review findById(int id);
	void delete(int id);
}
