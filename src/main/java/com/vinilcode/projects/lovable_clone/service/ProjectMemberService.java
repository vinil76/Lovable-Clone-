package com.vinilcode.projects.lovable_clone.service;

import com.vinilcode.projects.lovable_clone.dto.member.InviteMemberRequest;
import com.vinilcode.projects.lovable_clone.dto.member.MemberResponse;
import com.vinilcode.projects.lovable_clone.dto.member.UpdateRoleRequest;
import com.vinilcode.projects.lovable_clone.entity.ProjectMember;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectMemberService {
    List<ProjectMember> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateRoleRequest request, Long userId);

    Void deleteProjectMember(Long projectId, Long memberId, Long userId);
}
