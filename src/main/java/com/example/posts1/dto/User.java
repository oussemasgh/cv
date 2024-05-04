package com.example.posts1.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotBlank(message = "Name is mandatory")
    String name;

    @Email(message = "Invalid email format")
    String email;

    @Size(min = 10, max = 15, message = "Phone number must be between 10 and 15 digits")
    String phone;

    @NotBlank(message = "Address is mandatory")
    String address;

    String workTitle;
}
