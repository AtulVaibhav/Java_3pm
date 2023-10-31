package com.javaLearning.SpringBootDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javaLearning.SpringBootDemo.entities.Product;
import com.javaLearning.SpringBootDemo.repository.ProductDao;

@Component
public class ProductServiceImpl implements ProductService {
    
	@Autowired
	private ProductDao productDao;
	
	@Override
	public Product addProduct(Product product) {
		return this.productDao.addProduct(product);
	}

	@Override
	public Product getById(int productId) {
		return this.productDao.getById(productId);
	}

	@Override
	public List<Product> getALL() {
		return this.productDao.getALL();
	}

	@Override
	public Product updateProduct(int productId, Product product) {
		return this.productDao.updateProduct(productId, product);
	}

	@Override
	public void deleteById(int productId) {
		this.productDao.deleteById(productId);

	}

	
}
