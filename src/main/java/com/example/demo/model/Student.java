package com.example.demo.model;

import java.time.LocalDate;

public class Student {
    private String name;
    private String email;
    private int age;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Student(String name, String email, int age, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.dob = dob;
    }

    public Student(String name, String email, int age, Long id, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.id = id;
        this.dob = dob;
    }

    public Student() {
    }

    private Long id;
    private LocalDate dob;

}
