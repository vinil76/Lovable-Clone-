package com.vinilcode.projects.lovable_clone.service;

import com.vinilcode.projects.lovable_clone.dto.auth.AuthResponse;
import com.vinilcode.projects.lovable_clone.dto.auth.LoginRequest;
import com.vinilcode.projects.lovable_clone.dto.auth.SignUpRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService {
    AuthResponse signup(SignUpRequest request);

    AuthResponse login(LoginRequest request);
}
