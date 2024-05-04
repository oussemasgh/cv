package com.example.posts1.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String schoolName;
    LocalDate startDate;
    LocalDate endDate;
    @Column(columnDefinition = "TEXT")
    String description;
    @ManyToOne
    @JoinColumn(name = "profile_id", nullable = false)
    @JsonBackReference
    private Profile profile;

}
