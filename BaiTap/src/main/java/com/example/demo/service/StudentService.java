package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> findStudentByApproved(){
		return studentRepository.getAllByApproved(0);
	}
	
	public List<Student> findAll(){
		return studentRepository.findAll();
	}
	
	public void save(Student student) {
		studentRepository.save(student);
	}
	
	public Student findById(String id) {
		return studentRepository.findById(id).get();

	}
}
