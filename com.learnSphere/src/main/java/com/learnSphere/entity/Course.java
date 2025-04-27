package com.learnSphere.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Course {
	@Id
	int courseId;
	String courseName;
	int coursePrice;
	@OneToMany
	List<Lesson> lessons;
	@ManyToMany
	List<Users> userList;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int courseId, String courseName, int coursePrice, List<Lesson> lessons, List<Users> userList) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
		this.lessons = lessons;
		this.userList = userList;
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
	public int getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}
	public List<Lesson> getLessons() {
		return lessons;
	}
	public void setLessons(List<Lesson> lessons) {
		this.lessons = lessons;
	}
	public List<Users> getUserList() {
		return userList;
	}
	public void setUserList(List<Users> userList) {
		this.userList = userList;
	}
	// In Courses class
	@Override
	public String toString() {
	    return "Course [courseId=" + courseId + ", courseName=" + courseName + ", coursePrice=" + coursePrice
	            + ", lessons=" + (lessons == null ? "null" : lessons.size()) + ", userList=" + (userList == null ? "null" : userList.size()) + "]";
	}

	
	
}
