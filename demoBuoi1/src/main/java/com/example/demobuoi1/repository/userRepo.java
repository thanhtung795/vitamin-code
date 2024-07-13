package com.example.demobuoi1.repository;

import com.example.demobuoi1.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepo extends JpaRepository<user, Integer> {

}
