package com.Collection.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product{
	int productId;
	String productName;
	int productRating;
	int productPrice;
	public Product(int productId, String productName, int productRating, int productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productRating = productRating;
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productRating=" + productRating
				+ ", productPrice=" + productPrice + "]";
	}
	
	
}

class SortByName implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return o1.productName.compareTo(o2.productName);
	}
	
}

class SortByPrice implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.productPrice > o2.productPrice) return 1;
	    else if(o1.productPrice==o2.productPrice) return 0;
 		else return -1;
	}
	
}

class SortByRating implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.productRating > o2.productRating) return 1;
	    else if(o1.productRating==o2.productRating) return 0;
 		else return -1;
	}
	
}
public class Test { 

	public static void main(String[] args) {
		Product p1 = new Product(101,"Mobile",4,50000);
		Product p2 = new Product(102,"TV",3,42000);
		Product p3 = new Product(103,"Laptop",5,60000);
		
		List<Product> listOfProducts = new ArrayList<>();
		listOfProducts.add(p1);
		listOfProducts.add(p2);
		listOfProducts.add(p3);
		System.out.println(listOfProducts);
		
		//Sort product based on Name
		System.out.println("Sorting products based on name");
		Collections.sort(listOfProducts, new SortByName());
		System.out.println(listOfProducts);
		System.out.println();
		
		//Sort products based on price
		System.out.println("Sorting products based on price");
		Collections.sort(listOfProducts, new SortByPrice());
		System.out.println(listOfProducts);
		System.out.println();
		
		//Sort products based on ratings
		
		System.out.println("Sorting products based on rating");
		Collections.sort(listOfProducts, new SortByRating());
		System.out.println(listOfProducts);
		System.out.println();
		
		
	
		
		
		
	}

}
