package com.vinilcode.projects.lovable_clone.dto.subscription;

public record PlanResponse(Long id,String name, Integer maxProjectId, Integer maxTokensPerDay, Boolean unlimitedAi,String price) {
}
