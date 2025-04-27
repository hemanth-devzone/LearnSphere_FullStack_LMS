package com.learnSphere.services;

import java.util.List;

import com.learnSphere.entity.Course;
import com.learnSphere.entity.Users;

public interface UserService {
	//adds new user to database
	String addUser(Users user);
	//checks email is already present in database or not
	boolean checkEmail(String email);
	//validates user's credentials
	boolean validate(String email, String password);
	//get user's role by providing email
	String getUserRole(String email);
	//get user by providing email
	Users getUser(String email);
	
	//save updated user to database
	String updateUser(Users user);
	
	
	
}
