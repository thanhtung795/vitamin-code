package com.example.demomybatic.api;

import com.example.demomybatic.entity.Users;
import com.example.demomybatic.mapper.UsersMapper;
import com.example.demomybatic.service.UserService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UsersAPI {
    @Autowired
    private UserService userService;
    @GetMapping("/getAllUser")
    public ResponseEntity<?> getUsers() {
        Map<String , Object> map = new HashMap<>();
        try {
            map.put("success",true);
            map.put("data",userService.getAllUsers());
            map.put("message","Call API success");
        }catch (Exception e){
            map.put("success",false);
            map.put("data",null);
            map.put("message","Call API faill");
            e.printStackTrace();
        }
        return ResponseEntity.ok(map);
    }
    @PostMapping("/saveUser")
    public ResponseEntity<?> saveUser(@RequestBody Users user) {
        Map<String , Object> map = new HashMap<>();
        try {
            map.put("success",true);
            map.put("data",userService.saveUser(user));
            map.put("message","Save user success");
        }catch (Exception e){
            map.put("success",false);
            map.put("data",null);
            map.put("message","Save user faill");
            e.printStackTrace();
        }
        return ResponseEntity.ok(map);
    }
    @PutMapping("/updateUser")
    public ResponseEntity<?> updateUser(@RequestBody Users user) {
        Map<String , Object> map = new HashMap<>();
        try {
            map.put("success",true);
            map.put("data",userService.updateUser(user));
            map.put("message","update user success");
        }catch (Exception e){
            map.put("success",false);
            map.put("data",null);
            map.put("message","update user faill");
            e.printStackTrace();
        }
        return ResponseEntity.ok(map);
    }
    @DeleteMapping("/deleteUser")
    public ResponseEntity<?> deleteUser(@RequestParam int id) {
        Map<String , Object> map = new HashMap<>();
        try {
            map.put("success",true);
            map.put("data",userService.deleteUser(id));
            map.put("message","deleted user success");
        }catch (Exception e){
            map.put("success",false);
            map.put("data",null);
            map.put("message","deleted user faill");
            e.printStackTrace();
        }
        return ResponseEntity.ok(map);
    }

}
