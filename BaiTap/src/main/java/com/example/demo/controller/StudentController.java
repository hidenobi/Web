package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@RequestMapping("/")
	public String home(Model model) {
		List<Student> list = studentService.findAll();
		model.addAttribute("list", list);
		return "home";
	}
	
	@RequestMapping("/approved/{id}")
	public String approved(@PathVariable("id") String id) {
		Student student = studentService.findById(id);
		student.setApproved(1);
		studentService.save(student);
		return "redirect:/";
	}
}
