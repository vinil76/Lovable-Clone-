package com.vinilcode.projects.lovable_clone.service;

import com.vinilcode.projects.lovable_clone.dto.auth.ProfileResponse;
import com.vinilcode.projects.lovable_clone.dto.auth.UserProfileResponse;
import org.jspecify.annotations.Nullable;

public interface UserService {
     UserProfileResponse getProfile(Long userId);
}
