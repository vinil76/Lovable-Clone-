package com.vinilcode.projects.lovable_clone.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    Project project;

    String path;
    String minioObjectKey;

    @ManyToOne
    @JoinColumn(name = "created_by", nullable = false)
    User createdBy;

    @ManyToOne
    @JoinColumn(name = "updated_by", nullable = false)
    User updatedBy;

    Instant createdAt;
    Instant updatedAt;
}
