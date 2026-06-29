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
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    User owner;
    Boolean isPublic;

    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;

}
