package com.example.demomybatic.mapper;

import com.example.demomybatic.entity.Roles;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {
    List<Roles> getRoles();
    int saveRoles(Roles roles);
    int updateRoles(Roles roles);
    int deleteRoles(int id);
}
