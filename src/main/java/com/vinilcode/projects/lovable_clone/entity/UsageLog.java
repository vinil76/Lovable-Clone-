package com.vinilcode.projects.lovable_clone.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@Table(name = "usage_log")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UsageLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    User user;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    Project project;

    String action;

    Integer tokensUsed;

    Integer durationMs;

    String metadata;

    Instant createdAt;
}