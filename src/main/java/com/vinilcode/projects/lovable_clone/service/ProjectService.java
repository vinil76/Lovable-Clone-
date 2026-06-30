package com.vinilcode.projects.lovable_clone.service;

import com.vinilcode.projects.lovable_clone.dto.project.ProjectRequest;
import com.vinilcode.projects.lovable_clone.dto.project.ProjectResponse;
import com.vinilcode.projects.lovable_clone.dto.project.ProjectSummaryResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectService {
     List<ProjectSummaryResponse> getUserProject(Long userId);

     List<ProjectResponse> getUserProjectById(Long id, Long userId);

     ProjectResponse createProject(ProjectRequest request, Long userId);

     ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

    void softDelete(Long id, Long userId);
}
