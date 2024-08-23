package com.sayak.service;

import com.sayak.model.Order;
import com.sayak.response.PaymentResponse;
import com.stripe.exception.StripeException;


public interface PaymentService {
    public PaymentResponse createPaymentLink(Order order) throws StripeException;


}
