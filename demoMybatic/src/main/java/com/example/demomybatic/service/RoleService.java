package com.example.demomybatic.service;

import com.example.demomybatic.entity.Roles;
import com.example.demomybatic.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements RoleMapper{
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Roles> getRoles() {
        return roleMapper.getRoles();
    }

    @Override
    public int saveRoles(Roles roles) {
        return roleMapper.saveRoles(roles);
    }

    @Override
    public int updateRoles(Roles roles) {
        return roleMapper.updateRoles(roles);
    }

    @Override
    public int deleteRoles(int id) {
        return roleMapper.deleteRoles(id);
    }
}
