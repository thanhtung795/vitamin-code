package com.example.demomybatic.mapper;

import com.example.demomybatic.entity.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UsersMapper  {
    List<Users> getAllUsers();
    int saveUser(Users users);
    int updateUser(Users users);
    int deleteUser(int id);
}
