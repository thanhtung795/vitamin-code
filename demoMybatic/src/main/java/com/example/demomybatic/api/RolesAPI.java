package com.example.demomybatic.api;

import com.example.demomybatic.entity.Roles;
import com.example.demomybatic.mapper.RoleMapper;
import com.example.demomybatic.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class RolesAPI {
    @Autowired
    private RoleService roleService;

    @GetMapping("/getAllRole")
    public ResponseEntity<?> getAllRole() {
        Map<String, Object> map = new HashMap<>();
        try {
            map.put("success", true);
            map.put("data", roleService.getRoles());
            map.put("message", "successfully");
        } catch (Exception e) {
            map.put("success", false);
            map.put("data", null);
            map.put("message", "faill");
            e.printStackTrace();
        }
        return ResponseEntity.ok(map);
    }

    @PostMapping("/saveRole")
    public ResponseEntity<?> saveRole(@RequestBody Roles role) {
        Map<String, Object> map = new HashMap<>();
        try {
            map.put("success", true);
            map.put("data", roleService.saveRoles(role));
            map.put("message", "successfully");
        } catch (Exception e) {
            map.put("success", false);
            map.put("data", null);
            map.put("message", "faill");
            e.printStackTrace();
        }
        return ResponseEntity.ok(map);
    }

    @PutMapping("/updateRole")
    public ResponseEntity<?> updateRole(@RequestBody Roles role) {
        Map<String, Object> map = new HashMap<>();
        try {
            map.put("success", true);
            map.put("data", roleService.updateRoles(role));
            map.put("message", "successfully");
        } catch (Exception e) {
            map.put("success", false);
            map.put("data", null);
            map.put("message", "faill");
            e.printStackTrace();
        }
        return ResponseEntity.ok(map);
    }

    @DeleteMapping("/deleteRole")
    public ResponseEntity<?> deleteRole(@RequestParam int id) {
        Map<String, Object> map = new HashMap<>();
        try {
            map.put("success", true);
            map.put("data", roleService.deleteRoles(id));
            map.put("message", "successfully");
        } catch (Exception e) {
            map.put("success", false);
            map.put("data", null);
            map.put("message", "faill");
            e.printStackTrace();
        }
        return ResponseEntity.ok(map);
    }
}
