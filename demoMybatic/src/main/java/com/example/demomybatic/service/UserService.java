package com.example.demomybatic.service;

import com.example.demomybatic.entity.Users;
import com.example.demomybatic.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UsersMapper{
    @Autowired
    private UsersMapper usersMapper;
    public List<Users> getAllUsers() {
        return usersMapper.getAllUsers();
    }

    public int saveUser(Users user) {
        return usersMapper.saveUser(user);
    }

    @Override
    public int updateUser(Users user) {
        return usersMapper.updateUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return usersMapper.deleteUser(id);
    }
}
