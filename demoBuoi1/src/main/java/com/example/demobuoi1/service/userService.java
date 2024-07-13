package com.example.demobuoi1.service;

import com.example.demobuoi1.entity.user;

import java.util.List;

public interface userService {
    public List<user> getAllUser();
    public user saveUser(user user);
    public user getUserById(int id);
    public user updateUser(int id, user user);
    public void deleteUser(int id);
}
