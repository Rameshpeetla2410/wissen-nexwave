package com.shop.repoistory;

import java.util.List;

import com.shop.model.Product;

public interface ProductRepository {
	void save(Product product);
	List<Product> findAll();
	Product find(int id);
	void update(Product product);
	void delete(int id);
}
