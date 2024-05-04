package com.example.posts1.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Min(1)
    @Max(10)
    Integer level;
    @JoinColumn(name = "profile_id", nullable = false)
    @ManyToOne
    @JsonBackReference
    private Profile profile;
    @OneToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;
}
