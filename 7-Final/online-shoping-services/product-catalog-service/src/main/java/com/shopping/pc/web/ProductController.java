package com.shopping.pc.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.pc.exceptions.ProductNotFoundException;
import com.shopping.pc.model.Product;
import com.shopping.pc.repository.ProductRepository;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@GetMapping(produces = { "application/json" })
	public List<Product> get() {
		List<Product> products = productRepository.find();
		return products;
	}

	@GetMapping(value = "{id}", produces = { "application/json" })
	public Product get(@PathVariable int id) {
		Product product = productRepository.findById(id);
		return product;
	}

	@GetMapping(produces = { "application/json" }, params = { "name" })
	public List<Product> get(@RequestParam(required=false) String name) {
		List<Product> products = productRepository.findByName(name);
		return products;
	}

	@ExceptionHandler(value = { ProductNotFoundException.class })
	public ResponseEntity<String> exceptionHandler(Throwable t) {
		return new ResponseEntity<String>(t.getMessage(), null, HttpStatus.NOT_FOUND);
	}

}
