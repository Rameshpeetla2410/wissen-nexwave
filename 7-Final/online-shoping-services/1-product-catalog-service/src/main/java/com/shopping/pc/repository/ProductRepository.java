package com.shopping.pc.repository;

import java.util.List;

import com.shopping.pc.model.Product;

public interface ProductRepository {
	List<Product> find();
	Product findById(int id);
	List<Product> findByName(String name);
}
