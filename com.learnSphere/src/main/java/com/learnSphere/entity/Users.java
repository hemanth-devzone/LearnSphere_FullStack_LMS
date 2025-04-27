package com.learnSphere.entity;

import java.util.List;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	String email;
	String password;
	String role;
	@ManyToMany
	List<Course> courses;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Users(int id, String name, String email, String password, String role, List<Course> courses) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = role;
		this.courses = courses;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	// In Users class
	@Override
	public String toString() {
	    return "Users [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", role=" + role
	            + ", courses=" + (courses == null ? "null" : courses.size()) + "]";
	}

	
	
}
