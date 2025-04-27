package com.learnSphere.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnSphere.entity.Comments;
import com.learnSphere.repository.CommentRepository;

@Service
public class CommentSeviceImplementation implements CommentService {

	@Autowired
	CommentRepository commentRepo;
	@Override
	public List<Comments> commentList() {
		return commentRepo.findAll();
	}
	@Override
	public String addComment(Comments comment) {
		commentRepo.save(comment);
		return "comment added";
	}

}
