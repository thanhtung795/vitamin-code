package com.example.demobuoi1.controller;

import com.example.demobuoi1.service.userService;
import com.example.demobuoi1.service.roleService;
import com.example.demobuoi1.entity.user;
import com.example.demobuoi1.entity.role;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final userService userService;
    private final roleService roleService;
    @GetMapping("/home")
    private String ViewHome(Model model) {
        List<user> user = userService.getAllUser();
        model.addAttribute("users", user);
        model.addAttribute("user", new user());
        return "index";
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute("user") user user, Model model) {
        userService.saveUser(user);
        List<user> users = userService.getAllUser();
        model.addAttribute("users", users);
        return "index";
    }

    @GetMapping("/userDelete/{id}")
    private String deleteUser(@PathVariable int id, Model model) {
        userService.deleteUser(id);
        List<user> users = userService.getAllUser();
        model.addAttribute("users", users);
        return "redirect:/home";
    }
}
