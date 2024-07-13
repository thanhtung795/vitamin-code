package com.example.demobuoi1.API;

import com.example.demobuoi1.entity.role;
import com.example.demobuoi1.repository.roleRepo;
import com.example.demobuoi1.service.roleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
public class roleAPI {
    @Autowired
    private roleService roleService;
    @GetMapping("/getAllRole")
    public ResponseEntity<?> getAllRole() {
        Map<String, Object> response = new HashMap<>();
        try {
            response.put("success", true);
            response.put("data",roleService.getAllRoles());
            response.put("message","CallAPI successfully");
        }catch (Exception e){
            response.put("success", false);
            response.put("data",null);
            response.put("message","CallAPI faill");
        }
        return ResponseEntity.ok(response);
    }
    @PostMapping("/saveRole")
    public ResponseEntity<?> postSaveRole(@RequestBody role role) {
        Map<String, Object> response = new HashMap<>();
        try {
            response.put("success", true);
            response.put("data",roleService.saveRole(role));
            response.put("message","CallAPI successfully");
        }catch (Exception e){
            response.put("success", false);
            response.put("data",null);
            response.put("message","CallAPI faill");
        }
        return ResponseEntity.ok(response);
    }
}
