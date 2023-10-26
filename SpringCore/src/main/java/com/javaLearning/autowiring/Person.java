package com.javaLearning.autowiring;

public class Person {
    private String personName;
	private Address address;

	public Person() {
		System.out.println("Person object created");
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
