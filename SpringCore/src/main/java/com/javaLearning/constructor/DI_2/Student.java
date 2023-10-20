package com.javaLearning.constructor.DI_2;

public class Student {
	private int studentId;
	private String studentName;
	private String courseEnrolled;
	private Address address;

	public Student(int studentId, String studentName, String courseEnrolled, Address address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.courseEnrolled = courseEnrolled;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", courseEnrolled=" + courseEnrolled
				+ ", address=" + address + "]";
	}

}
