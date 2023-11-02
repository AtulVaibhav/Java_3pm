package com.learning.UserManagement.payloads;

public class ApiResponse {
   String msg;
   Boolean status;
public ApiResponse(String msg, Boolean status) {
	super();
	this.msg = msg;
	this.status = status;
}
   
   
}
