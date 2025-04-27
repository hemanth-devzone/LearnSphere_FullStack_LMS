package com.learnSphere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnSphere.entity.Comments;

public interface CommentRepository extends JpaRepository<Comments,Integer>{

}
