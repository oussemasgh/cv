package com.example.posts1.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @JoinColumn(name = "user_id")
    @OneToOne
    private User user;
    @OneToMany(mappedBy = "profile")
    @JsonManagedReference
    private List<UserSkill> skills;
    @OneToMany(mappedBy = "profile", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<UserLanguage> languageSet;
    @OneToMany(mappedBy = "profile")
    @JsonManagedReference
    private List<WorkExperience> workExperienceSet;
    @OneToMany(mappedBy = "profile")
    @JsonManagedReference
    private List<Education> educationSet;
    private String instagramUrl;
    private String githubUrl;
    private String linkedinUrl;
}
