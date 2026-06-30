package com.vinilcode.projects.lovable_clone.service;

import com.vinilcode.projects.lovable_clone.dto.subscription.CheckoutResponse;
import com.vinilcode.projects.lovable_clone.dto.subscription.PortalResponse;
import com.vinilcode.projects.lovable_clone.dto.subscription.SubscriptionResponse;
import org.jspecify.annotations.Nullable;

public interface SubscriptionService {
     SubscriptionResponse getCurrentSubscription(Long userId);

     CheckoutResponse createCheckoutSession(Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
