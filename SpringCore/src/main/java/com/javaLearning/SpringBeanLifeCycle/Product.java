package com.javaLearning.SpringBeanLifeCycle;

public class Product {
   private String productName;
   
   public Product(){
	   System.out.println("Product instantiated");
   }
   
   public void setProductName(String productName){
	   this.productName = productName;
	   System.out.println("Value set successfully");
   }
   public String getProductName(){
	   return this .productName;
   }
   
   public void afterPropertySet(){
	  System.out.println("Object created with values"); 
   }
   
   public void destroy(){
	   System.out.println("Object destroyed");
   }
}
