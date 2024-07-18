package com.example.student.service.Impl;

import com.example.student.entity.entityClass;

import com.example.student.repository.entityClassrepo;
import com.example.student.service.entityClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class entityClassServiceImpl implements entityClassService {
@Autowired
private entityClassrepo entityClassrepo;

    @Override
    public List<entityClass> getAllClass() {
            return entityClassrepo.findAll();
    }

    @Override
    public entityClass saveClass(entityClass entityClass) {
        return entityClassrepo.save(entityClass);
    }
}
