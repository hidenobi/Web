package com.example.demo.service;
/*
 * @author: Vo Huu Tuan
 * @since:  08/06/2023 22:14
 * @github:  https://github.com/hidenobi
 * @update:
 *
 * */


import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    public void deleteStudentById(String id) {
        studentRepository.deleteById(id);
    }

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    public Student findStudentById(String id) {
        return studentRepository.findById(id).get();
    }
}
