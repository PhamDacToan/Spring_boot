package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Table(name = "users")
@Setter
public class User {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increase id
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String password;

    @Column(unique = true,nullable = false)
    private String email;

}
