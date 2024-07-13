package com.example.demobuoi1.API;

import com.example.demobuoi1.entity.user;
import com.example.demobuoi1.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class userAPI {
    @Autowired
    private userService userService;
    @Autowired
    private com.example.demobuoi1.repository.userRepo userRepo;

    @GetMapping("/getAllUser")
    public ResponseEntity<?> getAllRole() {
        Map<String, Object> response = new HashMap<>();
        try {
            response.put("success", true);
            response.put("data",userService.getAllUser());
            response.put("message","CallAPI successfully");
        }catch (Exception e){
            response.put("success", false);
            response.put("data",null);
            response.put("message","CallAPI fail");
        }
        return ResponseEntity.ok(response);
    }
    @PostMapping("/saveUser")
    public ResponseEntity<?> postSaveUser(@RequestBody user user) {
        Map<String, Object> response = new HashMap<>();
        try {
            response.put("success", true);
            response.put("data",userService.saveUser(user));
            response.put("message","CallAPI successfully");
        }catch (Exception e){
            response.put("success", false);
            response.put("data",null);
            response.put("message","CallAPI fail");
        }
        return ResponseEntity.ok(response);
    }
   @GetMapping("/getUser/{id}")
    public ResponseEntity<?> getUser(@PathVariable int id) {
        Map<String, Object> response = new HashMap<>();
        try {
            user user = userService.getUserById(id);
            if (user != null) {
                response.put("success", true);
                response.put("data",user);
                response.put("message","CallAPI successfully");
            }
            else {
                response.put("success", false);
                response.put("data",null);
                response.put("message","CallAPI faill");
            }
        }
        catch (Exception e){
            response.put("success", false);
            response.put("data",null);
            response.put("message","CallAPI faill");
        }
        return ResponseEntity.ok(response);
   }
   @PutMapping("/updateUser/{id}")
    public ResponseEntity<?> updateUser(@PathVariable int id, @RequestBody user user) {
        Map<String, Object> response = new HashMap<>();
        try {
            response.put("success", true);
            response.put("data",userService.updateUser(id,user));
            response.put("message","CallAPI successfully");
        }catch ( Exception e){
            response.put("success", false);
            response.put("data",null);
            response.put("message","CallAPI faill");
        }
        return ResponseEntity.ok(response);
   }
   @DeleteMapping("/userDelete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable int id) {
        Map<String, Object> response = new HashMap<>();
        try {
            response.put("success", true);
            userService.deleteUser(id);
            response.put("message","CallAPI successfully");
        } catch (Exception e){
            response.put("success", false);
            response.put("data",null);
            response.put("message","CallAPI fail");
        }
        return ResponseEntity.ok(response);
   }
}
