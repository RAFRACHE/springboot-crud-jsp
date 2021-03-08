package com.devcases.springboot.crud.library.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devcases.springboot.crud.library.model.Student;
import com.devcases.springboot.crud.library.repository.StudentRepository;


@Service
@Transactional
public class StudentServiceImplementation implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	
	@Override
	public List<Student> getAllStudents() {
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public void addStudent(Student student) {
		studentRepository.save(student);
	}

	@Override
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);
	}

}