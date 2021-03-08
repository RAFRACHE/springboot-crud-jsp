package com.devcases.springboot.crud.library.service;

import java.util.List;

import com.devcases.springboot.crud.library.model.Student;



public interface StudentService {

	
	 public List<Student> getAllStudents();
	 
	 public Student getStudentById(int id);
	 
	 public void addStudent(Student student);
	 
	 public void deleteStudent(int id);
	

}