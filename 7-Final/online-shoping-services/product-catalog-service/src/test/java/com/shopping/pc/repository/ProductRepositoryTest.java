package com.shopping.pc.repository;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.shopping.pc.ProductCatalogServiceApplication;
import com.shopping.pc.model.Product;

// unit-testing  ==> A A A

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { ProductCatalogServiceApplication.class })
public class ProductRepositoryTest {

	@Autowired
	private ProductRepository productRepository;

	@Test
	public void findAll() {
		List<Product> products = productRepository.find();
		assertEquals(2, products.size());
	}

	@Test
	public void findOne() {
		Product product = productRepository.findById(1);
		assertEquals("laptop", product.getName());
	}

}
