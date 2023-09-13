
// parent class reference can point to child type object

package com.Abstraction;

class Vehicle{
	
}

class Car extends Vehicle{
	
}

class Train extends Vehicle{
	
}

public class Test1 {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Car c = new Car();
		Vehicle v1 = new Car();
        Vehicle v2 = new Train();
	}

}
