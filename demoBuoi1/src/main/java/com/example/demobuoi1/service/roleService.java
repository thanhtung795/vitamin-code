package com.example.demobuoi1.service;

import com.example.demobuoi1.entity.role;

import java.util.List;

public interface roleService {
    public List<role> getAllRoles();
    public role saveRole(role role);
    public int deleteRole(int id);
    public int updateRole(int id,String roleName,String description);
}
