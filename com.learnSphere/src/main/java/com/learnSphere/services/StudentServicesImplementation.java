package com.learnSphere.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnSphere.entity.Course;
import com.learnSphere.entity.Lesson;
import com.learnSphere.entity.Users;
import com.learnSphere.repository.LessonRepository;
import com.learnSphere.repository.UserRepository;

@Service
public class StudentServicesImplementation implements StudentServices{
	@Autowired
	UserRepository ur;
	@Autowired
	LessonRepository lessonRepo;
	@Override
	public Lesson getLesson(int lessonId) {
		
		return lessonRepo.findById(lessonId).get();
		
	}
	
	

}
