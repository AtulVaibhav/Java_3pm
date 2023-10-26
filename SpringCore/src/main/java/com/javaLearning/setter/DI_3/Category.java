package com.javaLearning.setter.DI_3;

import java.util.List;

public class Category {
	private int categoryId;
	private String categoryName;
	private String categoryDesc;
	private List<String> listOfProdcuts;
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
	public List<String> getListOfProdcuts() {
		return listOfProdcuts;
	}
	public void setListOfProdcuts(List<String> listOfProdcuts) {
		this.listOfProdcuts = listOfProdcuts;
	}
	
	

	
}
