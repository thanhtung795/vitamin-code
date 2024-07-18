package com.example.student.repository;

import com.example.student.entity.entityClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface entityClassrepo extends JpaRepository<entityClass,Integer> {
}
