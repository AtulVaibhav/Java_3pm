package com.javaLearning.Hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_info")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="student_name")
	private String name;
	
	@Column(name="course_enrolled")
	private String courseEnrolled;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String courseEnrolled) {
		super();
		this.id = id;
		this.name = name;
		this.courseEnrolled = courseEnrolled;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourseEnrolled() {
		return courseEnrolled;
	}

	public void setCourseEnrolled(String courseEnrolled) {
		this.courseEnrolled = courseEnrolled;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courseEnrolled=" + courseEnrolled + "]";
	}

}
