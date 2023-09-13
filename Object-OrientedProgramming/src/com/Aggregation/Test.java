package com.Aggregation;

class Address{
	String city;
	String state;
	String country;
	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}	
	
	
}
class Employee{
	int id;
	String name;
	String deptName;
	Address address;//reference
	public Employee(int id, String name, String deptName, Address address) {
		super();//Object
		this.id = id;
		this.name = name;
		this.deptName = deptName;
		this.address = address;
	}
//	public void show(){
//		System.out.println("Id :"+this.id+" Name :"+this.name+" deptName "
//				+this.deptName+
//				" city:"+this.address.city+
//				" state :"+this.address.state+
//				" country :"+this.address.country);
//	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deptName=" + deptName + ", address=" + address + "]";
	}
	
	
}


public class Test {

	public static void main(String[] args) {
		Address add = new Address("Bangalore","Karnataka","India");
		Employee emp = new Employee(101,"Harsh","R&D",add);
		System.out.println(emp);

	}
}
