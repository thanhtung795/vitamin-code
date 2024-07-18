package com.example.student.API;

import com.example.student.entity.Classes;
import com.example.student.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class classAPI {
@Autowired
private ClassService entityClassService;
@GetMapping("/getAllClass")
    public ResponseEntity<?>  getAllClass(){
    Map<String, Object>  response = new HashMap<>();
    try {
        response.put("sucess",true);
        response.put("data",entityClassService.getAllClass());
        response.put("success","call API sucessfully");
    }catch (Exception e){
        response.put("sucess",false);
        response.put("success","call API sucessfully");
        response.put("message","call API error");
    }
    return ResponseEntity.ok(response);
    }
    @PostMapping("/addClass")
    public ResponseEntity<?>  addClass(@RequestBody Classes entityClass){
    Map<String, Object>  response = new HashMap<>();
    try {
        response.put("sucess",true);
        response.put("data",entityClassService.saveClass(entityClass));
        response.put("success","call API sucessfully");
    }catch (Exception e){
        response.put("sucess",false);
        response.put("success","call API sucessfully");
        response.put("message","call API error");
    }
    return ResponseEntity.ok(response);
    }
}

