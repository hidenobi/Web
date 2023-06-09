package com.example.demo.controller;
/*
 * @author: Vo Huu Tuan
 * @since:  08/06/2023 20:36
 * @github:  https://github.com/hidenobi
 * @update:
 *
 * */

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentServer;

    private Student addNewStudent = new Student();

    @RequestMapping("/")
    public String home(Model model) {
        List<Student> list = studentServer.getAllStudent();
        model.addAttribute("list", list);
        return "home";
    }

    @RequestMapping("/addNewStudent")
    public String addNewStudent(Model model) {
        model.addAttribute("newStudent", new Student());
        return "addNewStudent";
    }

    @RequestMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable("id") String id, Model model) {
        model.addAttribute("idCheck", id);
        return "deleteStudent";
    }

    @RequestMapping("/actionConfirmDelete/{id}")
    public String actionConfirmDelete(@PathVariable("id") String id, Model model) {
        studentServer.deleteStudentById(id);
        return "redirect:/";
    }

    @RequestMapping("/actionAddStudent")
    public String actionAddStudent(@ModelAttribute("newStudent") Student student) {
        studentServer.saveStudent(student);
        return "redirect:/";
    }

    @RequestMapping("/editStudent/{id}")
    public String editStudent(@PathVariable("id") String id, Model model) {
        Student student = studentServer.findStudentById(id);
        model.addAttribute("newStudent", student);
        return "addNewStudent";
    }

    @RequestMapping("/form")
    public String form(Model model) {
        model.addAttribute("formNewStudent", new Student());
        return "form";
    }

    @RequestMapping("/form/addNewStudent")
    public String confirmAddStudent(Model model, @ModelAttribute("formNewStudent") Student student) {
        model.addAttribute("confirmNewStudent", student);
        addNewStudent = student;
        return "confirmAddStudent";
    }

    @RequestMapping("/form/addNewStudent/confirmAddStudent")
    public String save(@ModelAttribute("confirmNewStudent") Student student) {
        System.out.println("Tag=save Log: " + student);
        studentServer.saveStudent(addNewStudent);
        return "redirect:/form";
    }

}
