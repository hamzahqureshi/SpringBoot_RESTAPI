package com.learning.springbootrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.springbootrestapi.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
