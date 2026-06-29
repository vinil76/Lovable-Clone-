package com.vinilcode.projects.lovable_clone.entity;

import com.vinilcode.projects.lovable_clone.enums.SubscriptionStatus;
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
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    User user;

    @ManyToOne
    @JoinColumn(name = "plan_id", nullable = false)
    Plan plan;

    String stripeSubscriptionId;

    @Enumerated(EnumType.STRING)
    SubscriptionStatus status;

    Instant currentPeriodStart;
    Instant currentPeriodEnd;
    Boolean cancelAtPeriodEnd = false;



    Instant createdAt;
    Instant updatedAt;

}
