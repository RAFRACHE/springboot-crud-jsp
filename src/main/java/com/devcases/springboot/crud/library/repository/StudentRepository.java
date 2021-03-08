package com.devcases.springboot.crud.library.repository;

import org.springframework.data.repository.CrudRepository;

import com.devcases.springboot.crud.library.model.Student;



public interface StudentRepository extends CrudRepository<Student, Integer> {

}