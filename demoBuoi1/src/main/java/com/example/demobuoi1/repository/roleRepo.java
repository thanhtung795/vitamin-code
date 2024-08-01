package com.example.demobuoi1.repository;

import com.example.demobuoi1.entity.role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface roleRepo extends JpaRepository<role,Integer> {
    @Modifying
    @Query(value = "delete from roles where role_id = ?1", nativeQuery = true)
    int deleteByRoleId(int id);

    @Modifying
    @Query(value = "update Roles set role_name = ?2 , description = ?3 where role_id = ?1 ", nativeQuery = true)
    int updateRoleName(int id, String roleName,String description);
}
