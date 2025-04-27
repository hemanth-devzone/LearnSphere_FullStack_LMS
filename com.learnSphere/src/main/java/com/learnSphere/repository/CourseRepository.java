package com.learnSphere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnSphere.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{

}
