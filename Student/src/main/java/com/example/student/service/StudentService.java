package com.example.student.service;

import com.example.student.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudent();
    public Student saveStudent(Student entityClass);
}
