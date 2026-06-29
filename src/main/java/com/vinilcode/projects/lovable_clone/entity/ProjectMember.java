package com.vinilcode.projects.lovable_clone.entity;

import com.vinilcode.projects.lovable_clone.enums.ProjectRole;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@Table(name = "project_member")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectMember {

    @EmbeddedId
    ProjectMemberId id;

    @MapsId("projectId")
    @ManyToOne
    @JoinColumn(name = "project_id")
    Project project;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    ProjectRole projectRole;

    Instant invitedAt;
    Instant acceptedAt;

}
