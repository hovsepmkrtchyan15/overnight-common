package com.example.overnightweb.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotEmpty(message = "User's name cannot be null.")
    private String name;
    @NotEmpty(message = "User's surname cannot be null.")
    private String surname;
    @Email(message = "Please provide a valid email address.")
    @NotEmpty(message = "User's email cannot be empty.")
    private String email;
    private String password;
    private String phoneNumber;
    private String picUrl;
    @Enumerated(EnumType.STRING)
    private RoleUser role;
    @Enumerated(EnumType.STRING)
    private StatusSeller status;
    private boolean isEnabled;
    private String verifyToken;


}
