package com.learning.UserManagement.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="user_info")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	
	@NotEmpty(message="username can't be null or empty")
	@Size(min=4,message="username must have minimum 4 characters")
	private String username;
	
	@Email
	@NotEmpty(message="email can't be null or empty")
	private String email;
	
	@NotEmpty(message="Password can't be null or empty")
	@Size(min=6,message="Password length must be equal to or greater than 6 characters")
	private String password;
	private String contactNumber;
   
}
