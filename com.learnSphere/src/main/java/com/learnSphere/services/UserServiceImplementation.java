package com.learnSphere.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnSphere.entity.Users;
import com.learnSphere.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService{
	@Autowired
	UserRepository repo;
	
	@Override
	public String addUser(Users user) {
		repo.save(user);
		return "student added successfully!";
	}

	@Override
	public boolean checkEmail(String email) {
		return repo.existsByEmail(email);
	}

	@Override
	public boolean validate(String email, String password) {
		if(repo.existsByEmail(email)) {
			Users u=repo.getByEmail(email);
			String dbPassword=u.getPassword();
			if(password.equals(dbPassword)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}

	@Override
	public String getUserRole(String email) {
		Users u=repo.getByEmail(email);
		return u.getRole();
	}

	@Override
	public Users getUser(String email) {
		return repo.getByEmail(email);
	}

	@Override
	public String updateUser(Users user) {
		repo.save(user);
		return "student updated successfully!";
	}

}

