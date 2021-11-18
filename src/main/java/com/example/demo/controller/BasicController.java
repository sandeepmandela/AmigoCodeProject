package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BasicController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/Students")
    public List<Student> getAllStudents(){
        return StudentService.getStudents();
    }
}
