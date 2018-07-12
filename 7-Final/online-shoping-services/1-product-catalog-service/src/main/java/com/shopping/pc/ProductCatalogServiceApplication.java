package com.shopping.pc;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.shopping.pc.model.Product;
import com.shopping.pc.model.Review;
import com.shopping.pc.repository.ProductRepository;
import com.shopping.pc.repository.ReviewRepository;

@SpringBootApplication
@EnableTransactionManagement
public class ProductCatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductCatalogServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner test(ProductRepository productRepository, ReviewRepository reviewRepository) {
		return args -> {

			// List<Product> products=productRepository.find();
			// System.out.println(products.size());

			// -------------------------------------------------------------------
			//
			// products=productRepository.findByName("ipad");
			// System.out.println(products.size());

			// -------------------------------------------------------------------

			// Product product=productRepository.findById(1);
			// System.out.println(product);

			// ---------------------------------------------------------------

			// Review review=new Review();
			// review.setStars(4);
			// review.setAuthor("nag@gmail.com");
			// review.setBody("sample review-2");
			//
			// Product product=new Product();
			// product.setId(1);
			//
			// review.setProduct(product);
			//
			// reviewRepository.save(review);

			// -------------------------------------------------------------------

			// List<Review> reviews=reviewRepository.findByProduct(1);
			// reviews.forEach(item->{
			// System.out.println(item);
			// });

			// ---------------------------------------------------------------------
		};
	}

}
