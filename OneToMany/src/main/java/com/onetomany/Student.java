package com.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student_data")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int studentId;
	@Column
   private String studentName;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="student")
   private List<Course> course;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentName, List<Course> course) {
		super();
		this.studentName = studentName;
		this.course = course;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	
	
}
