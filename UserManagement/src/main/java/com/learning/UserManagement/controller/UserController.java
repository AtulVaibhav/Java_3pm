package com.learning.UserManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.UserManagement.entities.User;
import com.learning.UserManagement.payloads.UserDto;
import com.learning.UserManagement.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public ResponseEntity<UserDto> createUser(@RequestBody User user){
		UserDto savedUserDto = this.userService.addUser(user);
		return new ResponseEntity<>(savedUserDto,HttpStatus.CREATED);
	}

}
