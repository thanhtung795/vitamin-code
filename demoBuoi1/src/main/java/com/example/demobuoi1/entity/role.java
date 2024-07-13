package com.example.demobuoi1.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Roles")
public class role
{
    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer roleId;
    @Column(name = "role_name")
    private String roleName;
    @Column(name = "description")
    private String description;
    @OneToMany(mappedBy = "role")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    @JsonManagedReference
    private List<user> users;
}
