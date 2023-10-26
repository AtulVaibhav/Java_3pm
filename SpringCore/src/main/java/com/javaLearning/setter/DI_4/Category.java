package com.javaLearning.setter.DI_4;

import java.util.List;

public class Category {
	private int categoryId;
	private String categoryName;
	private String categoryDesc;
	private List<Product> listOfProdcuts;
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryDesc() {
		return categoryDesc;
	}
	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}
	public List<Product> getListOfProdcuts() {
		return listOfProdcuts;
	}
	public void setListOfProdcuts(List<Product> listOfProdcuts) {
		this.listOfProdcuts = listOfProdcuts;
	}
	
	

	
}
