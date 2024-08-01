package com.example.demomybatic.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    private int userId;
    private String userName;
    private int age;
    private String email;
    private String password;
    private int roleId;

}
