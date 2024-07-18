package com.example.student.API;

import com.example.student.entity.entityStudent;
import com.example.student.service.entityStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class studentAPI {
    @Autowired
    private entityStudentService entityStudentService;
    @GetMapping("/getAllStudent")
    public ResponseEntity<?> getAllClass(){
        Map<String, Object> response = new HashMap<>();
        try {
            response.put("sucess",true);
            response.put("data",entityStudentService.getAllStudent());
            response.put("success","call API sucessfully");
        }catch (Exception e){
            response.put("sucess",false);
            response.put("success","call API sucessfully");
            response.put("message","call API error");
        }
        return ResponseEntity.ok(response);
    }
   @PostMapping("/addStudent")
    public ResponseEntity<?> addStudent(@RequestBody entityStudent student){
        Map<String, Object> response = new HashMap<>();
        try {
            response.put("sucess",true);
            response.put("data",entityStudentService.saveStudent(student));
            response.put("message","call API sucessfully");
        }catch (Exception e){
            response.put("sucess",false);
            response.put("data",null);
            response.put("message","call API error");
        }
        return ResponseEntity.ok(response);
   }

}
