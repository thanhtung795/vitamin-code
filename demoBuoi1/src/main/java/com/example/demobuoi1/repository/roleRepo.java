package com.example.demobuoi1.repository;

import com.example.demobuoi1.entity.role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface roleRepo extends JpaRepository<role,Integer> {

}
