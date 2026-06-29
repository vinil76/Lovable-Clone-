package com.vinilcode.projects.lovable_clone.entity;

import com.vinilcode.projects.lovable_clone.enums.PreviewStatus;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@Table(name = "preview")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Preview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne
    @JoinColumn(name = "project_id", unique = true, nullable = false)
    Project project;

    String namespace;
    String podName;
    String minioObjectKey;
    String previewUrl;

    @Enumerated(EnumType.STRING)
    PreviewStatus status;

    Instant startedAt;
    Instant terminatedAt;
    Instant createdAt;
}