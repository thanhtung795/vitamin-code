package com.example.student.service;

import com.example.student.entity.entityStudent;

import java.util.List;

public interface entityStudentService {
    public List<entityStudent> getAllStudent();
    public entityStudent saveStudent(entityStudent entityClass);
}
