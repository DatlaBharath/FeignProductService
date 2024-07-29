package com.iiht.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.product.model.Product;
import com.iiht.product.service.ProductService;

@RestController

@RequestMapping("/product-service")

public class ProductController {

	

	@Autowired

	ProductService product;

	@Autowired
	Environment env;
	
	@GetMapping("/port")

	public String findport(){
		

	return env.getProperty("server.port");

	}

	@GetMapping("/products")

	public List<Product> findAll(){

		

	return product.findAll();

	}

	@GetMapping("/products-by-category/{category}")

	public List<Product> findByCategory(@PathVariable("category") String category){

		return product.findByCategory(category);

		

	}

	@GetMapping("/products-by-id/{id}")

	public Product findById(@PathVariable("id") int id) {

		return product.findById(id);

		

	}



}


