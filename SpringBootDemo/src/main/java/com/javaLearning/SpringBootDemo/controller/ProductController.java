package com.javaLearning.SpringBootDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaLearning.SpringBootDemo.entities.Product;
import com.javaLearning.SpringBootDemo.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product){
		return this.productService.addProduct(product);
	}
   
	@GetMapping("/product/{productId}")
	public Product getProductById(@PathVariable int productId){

		return this.productService.getById(productId);
	}
	
	@GetMapping("/product")
	public List<Product> getAllProducts(){
		return this.productService.getALL();
	}
	
	@PutMapping("/product/{productId}")
	public Product updateProduct(@PathVariable int productId,@RequestBody Product product){
		return this.productService.updateProduct(productId, product);
	}
	
	@DeleteMapping("/product/{productId}")
	public String deleteProductById(@PathVariable int productId){
		this.productService.deleteById(productId);
		return "Product deleted successfully";
	}
	
	/*@GetMapping("/product/{productName}")
	public Product searchProduct(@PathVariable String productName){
		return this.productService.searchProduct(productName);
	}*/
	
	
	
}
