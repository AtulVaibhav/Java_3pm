package com.learning.UserManagement.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter

public class ResourceNotFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	String resourceName;
	String fieldName;
	Long fieldValue;
	public ResourceNotFoundException(String resourceName, String fieldName, long fieldValue) {
		super(String.format("%s not found with %s:%s ", resourceName,fieldName,fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	};
	

}
