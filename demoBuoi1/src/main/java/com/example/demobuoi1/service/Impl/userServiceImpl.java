package com.example.demobuoi1.service.Impl;

import com.example.demobuoi1.entity.user;
import com.example.demobuoi1.repository.userRepo;
import com.example.demobuoi1.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userServiceImpl implements userService {
    @Autowired
    private userRepo userRepo;

    @Override
    public List<user> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public user saveUser(user user) {
        return userRepo.save(user);
    }

    @Override
    public user getUserById(int id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public user updateUser(int id, user user) {
        Optional<user> userUpdate = userRepo.findById(id);
        if (userUpdate.isPresent()) {
            user foundUser = userUpdate.get();
            foundUser.setUserName(user.getUserName());
            foundUser.setAge(user.getAge());
            foundUser.setEmail(user.getEmail());
            foundUser.setPassword(user.getPassword());
            foundUser.setRole(user.getRole());
            return userRepo.save(foundUser);
        } else {
            return null;
        }
    }

    @Override
    public void deleteUser(int id) {
    Optional<user> userDelete = userRepo.findById(id);
    if (userDelete.isPresent()) {
        userRepo.delete(userDelete.get());
        }
    }

}
