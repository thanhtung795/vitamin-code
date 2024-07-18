package com.example.student.service;

import com.example.student.entity.entityClass;

import java.util.List;

public interface entityClassService {
    public List<entityClass> getAllClass();
    public entityClass saveClass(entityClass entityClass);
}
