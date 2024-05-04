package com.example.posts1.controller;

import com.example.posts1.dto.Profile;
import com.example.posts1.service.ProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/profiles")
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/{id}")
    public String getProfileById(@PathVariable Long id, Model model) {
        Profile profile = profileService.getProfileById(id).orElse(null);
        model.addAttribute("profile", profile);
        return "profile";
    }
}