package com.javaLearning.SpringBootDemo.service;

import java.util.List;

import com.javaLearning.SpringBootDemo.entities.Product;

public interface ProductService {

	Product addProduct(Product product);

	Product getById(int productId);

	List<Product> getALL();

	Product updateProduct(int productId, Product product);

	void deleteById(int productId);

	

}
