package com.javaLearning.SpringBootDemo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.javaLearning.SpringBootDemo.entities.Product;

@Component
public class ProductDaoImpl implements ProductDao {
    static List<Product> list;
    
    static{
    	list = new ArrayList<>();
    }

	@Override
	public Product addProduct(Product product) {
		list.add(product);
		return product;
	}

	@Override
	public Product getById(int productId) {
       return list.stream()
		      .filter(obj->obj.getProductId()==productId)
		      .findFirst().get();
		
	}

	@Override
	public List<Product> getALL() {
		return list;
	}

	@Override
	public Product updateProduct(int productId, Product product) {
		Product savedProduct = list.stream()
			               .filter(obj->obj.getProductId()==productId)
			               .findFirst().get();
		if(list.contains(savedProduct)){
		savedProduct.setProductId(product.getProductId());
		savedProduct.setProductName(product.getProductName());
		savedProduct.setProductPrice(product.getProductPrice());
		savedProduct.setProductDescription(product.getProductDescription());
		
		
		}
		return product;
		
	}

	@Override
	public void deleteById(int productId) {
	Product product =list.stream()
	      .filter(obj->obj.getProductId()==productId)
	      .findFirst().get();
	
	if(product!=null){
		list.remove(product);
	}

	}

	
}
