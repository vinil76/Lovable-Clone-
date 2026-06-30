package com.vinilcode.projects.lovable_clone.dto.subscription;

public record PlanLimitsResponse(String planName,int maxTokenPerDay,int maxProjects,boolean unlimitedAi) {
}
