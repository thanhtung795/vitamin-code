package com.example.student.service.Impl;

import com.example.student.entity.Student;
import com.example.student.repository.StudentRepo;
import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepo entityStudentrepo;
    @Override
    public List<Student> getAllStudent() {
        return entityStudentrepo.findAll();
    }

    @Override
    public Student saveStudent(Student entityClass) {
        return entityStudentrepo.save(entityClass);
    }
}