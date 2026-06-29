package com.vinilcode.projects.lovable_clone.entity;

import com.vinilcode.projects.lovable_clone.enums.MessageRole;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@Table(name = "chat_message")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    Project project;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    User user;

    @Enumerated(EnumType.STRING)
    MessageRole role;

    @Column(columnDefinition = "TEXT")
    String content;

    String toolCalls;

    String toolCallId;

    Integer tokensUsed;

    Instant createdAt;
}