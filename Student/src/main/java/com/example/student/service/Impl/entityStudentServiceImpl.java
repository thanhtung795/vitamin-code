package com.example.student.service.Impl;

import com.example.student.entity.entityStudent;
import com.example.student.repository.entityStudentrepo;
import com.example.student.service.entityStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class entityStudentServiceImpl implements entityStudentService {
    @Autowired
    private entityStudentrepo entityStudentrepo;
    @Override
    public List<entityStudent> getAllStudent() {
        return entityStudentrepo.findAll();
    }

    @Override
    public entityStudent saveStudent(entityStudent entityClass) {
        return entityStudentrepo.save(entityClass);
    }
}