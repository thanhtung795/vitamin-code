package com.example.demobuoi1.service.Impl;

import com.example.demobuoi1.entity.role;
import com.example.demobuoi1.repository.roleRepo;
import com.example.demobuoi1.service.roleService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class roleServiceImpl implements roleService{
    @Autowired
    private roleRepo roleRepo;
    @Override
    public List<role> getAllRoles() {
        return roleRepo.findAll();
    }

    @Override
    public role saveRole(role role) {
        return roleRepo.save(role);
    }

    @Transactional
    @Override
    public int deleteRole(int roleId) {
        return roleRepo.deleteByRoleId(roleId);
    }
    @Transactional
    @Override
    public int updateRole(int id,String roleName,String description) {
        return roleRepo.updateRoleName(id ,roleName ,description);
    }
}
