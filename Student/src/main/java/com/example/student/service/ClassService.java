package com.example.student.service;

import com.example.student.entity.Classes;

import java.util.List;

public interface ClassService {
    public List<Classes> getAllClass();
    public Classes saveClass(Classes entityClass);
}
