package com.example.student.repository;

import com.example.student.entity.entityStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface entityStudentrepo extends JpaRepository<entityStudent,Integer> {
}
