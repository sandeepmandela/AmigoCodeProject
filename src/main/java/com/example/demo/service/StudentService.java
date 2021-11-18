package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public static List<Student> getStudents(){
        return List.of(new Student("Harsha",
                "Harsha.mogili@gmail.com",
                31,
                LocalDate.of(2000, Month.NOVEMBER,5)
        ));
    }
}
