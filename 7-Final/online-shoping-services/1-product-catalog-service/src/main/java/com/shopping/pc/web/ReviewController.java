package com.shopping.pc.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.pc.model.Product;
import com.shopping.pc.model.Review;
import com.shopping.pc.repository.ReviewRepository;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(value = "/api/products/{productId}/reviews")
public class ReviewController {

	@Autowired
	private ReviewRepository reviewRepository;

	@PostMapping(consumes = { "application/json" }, produces = { "application/json" })
	public Review post(@PathVariable int productId, @RequestBody ReviewForm form) {

		// validate

		Product product = new Product();
		product.setId(productId);

		Review review = new Review();
		review.setProduct(product);
		review.setStars(form.getStars());
		review.setAuthor(form.getAuthor());
		review.setBody(form.getBody());

		return reviewRepository.save(review);
	}

	@GetMapping
	public List<Review> getByProduct(@PathVariable int productId) {
		return reviewRepository.findByProduct(productId);
	}

	@GetMapping(value = "/{reviewId}")
	public Review get(@PathVariable int reviewId) {
		return reviewRepository.findById(reviewId);
	}

	@DeleteMapping(value = "/{reviewId}")
	public void delete(@PathVariable int reviewId) {
		reviewRepository.delete(reviewId);
	}

}
