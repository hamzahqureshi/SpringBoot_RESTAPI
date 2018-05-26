package com.learning.springbootrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springbootrestapi.model.Student;
import com.learning.springbootrestapi.repository.StudentRepository;

@RestController
@RequestMapping("/api/students")
public class SimpleController {

	@Autowired
	StudentRepository stdRepo;
	
	@GetMapping
	public Iterable<Student> findAll()
	{
		return stdRepo.findAll();
	}
	
	@PostMapping
	public Student create(Student std)
	{
		return stdRepo.save(std);
	}
}
