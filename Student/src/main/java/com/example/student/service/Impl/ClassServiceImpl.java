package com.example.student.service.Impl;

import com.example.student.entity.Classes;

import com.example.student.repository.ClassRepo;
import com.example.student.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {
@Autowired
private ClassRepo entityClassrepo;

    @Override
    public List<Classes> getAllClass() {
            return entityClassrepo.findAll();
    }

    @Override
    public Classes saveClass(Classes entityClass) {
        return entityClassrepo.save(entityClass);
    }
}
