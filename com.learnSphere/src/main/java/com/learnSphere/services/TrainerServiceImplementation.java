package com.learnSphere.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnSphere.entity.Course;
import com.learnSphere.entity.Lesson;
import com.learnSphere.repository.CourseRepository;
import com.learnSphere.repository.LessonRepository;

@Service
public class TrainerServiceImplementation implements TrainerService{

	@Autowired
	CourseRepository courseRepo;
	
	@Autowired
	LessonRepository lessonRepo;
	
	@Override
	public String addCourse(Course course) {
		courseRepo.save(course);
		return "Course added successfully!";
	}
	@Override
	public String addLesson(Lesson lesson) {
		lessonRepo.save(lesson);
		return "lesson added successfully!";
	}
	@Override
	public Course getCourse(int courseId) {
		return courseRepo.findById(courseId).get();
	}
	@Override
	public List<Course> courseList() {
		return courseRepo.findAll();
	}
	@Override
	public String saveCourse(Course course) {
		courseRepo.save(course);
		return "Course saved successfully!";
	}
	
}
