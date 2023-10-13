package com.onetomany;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="course_data")
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int courseId;
	
	@Column
    private String courseName;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="s_id")
    private Student student;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String courseName, Student student) {
		super();
		this.courseName = courseName;
		this.student = student;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
    
    
}
