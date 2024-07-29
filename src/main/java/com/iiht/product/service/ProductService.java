package com.iiht.product.service;

import java.util.List;

import com.iiht.product.model.Product;

public interface ProductService {
	List<Product> findAll();
	List<Product> findByCategory(String category);
	Product findById(int id);
}
