package com.javlearning.hibernate.collection;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	@Column
	private String username;
	@Column
	private String email;

	@ElementCollection
	@CollectionTable(name = "user_contacts", joinColumns = @JoinColumn(name = "user_id"))
	private List<Integer> contactNumbers;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String username, String email, List<Integer> contactNumbers) {
		super();
		this.username = username;
		this.email = email;
		this.contactNumbers = contactNumbers;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Integer> getContactNumbers() {
		return contactNumbers;
	}

	public void setContactNumbers(List<Integer> contactNumbers) {
		this.contactNumbers = contactNumbers;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", email=" + email + ", contactNumbers="
				+ contactNumbers + "]";
	}

}
