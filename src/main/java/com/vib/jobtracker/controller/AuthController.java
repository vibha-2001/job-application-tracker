package com.vib.jobtracker.controller;

import com.vib.jobtracker.DTO.LoginRequest;
import com.vib.jobtracker.DTO.RegisterRequest;
import com.vib.jobtracker.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public String register(@Valid @RequestBody RegisterRequest request) {
        return authService.register(request);
    }
    /**
     * 🔐 Login user
     * POST /auth/login
     */
    @PostMapping("/login")
    public String login(@Valid @RequestBody LoginRequest request) {
        return authService.login(request);
    }

}