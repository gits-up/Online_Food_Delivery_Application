package com.sayak.service;

import org.springframework.beans.factory.annotation.Value;

import com.sayak.model.Order;
import com.sayak.response.PaymentResponse;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.checkout.Session;
import com.stripe.param.checkout.SessionCreateParams;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImp implements PaymentService {

    @Value("${stripe.api.key}")
    private String stripeSecretKey;

    @Override
    public PaymentResponse createPaymentLink(Order order) throws StripeException {
        Stripe.apiKey = stripeSecretKey;
        SessionCreateParams params = SessionCreateParams.builder()
                .addPaymentMethodType(SessionCreateParams.PaymentMethodType.CARD)
                .setMode(SessionCreateParams.Mode.PAYMENT)
                .setSuccessUrl("http://localhost:8080/payment/success/" + order.getId())
                .setCancelUrl("http://localhost:8080/payment/fail")
                .addLineItem(
                        SessionCreateParams.LineItem.builder().setQuantity(1L).setPriceData(
                                SessionCreateParams.LineItem.PriceData.builder().setCurrency("inr")
                                        .setUnitAmount((long) order.getTotalPrice() * 100)
                                        .setProductData(SessionCreateParams.LineItem.PriceData.ProductData.builder()
                                                .setName("Cloud Food").build())
                                        .build())
                                .build())
                .build();
        Session session = Session.create(params);
        PaymentResponse res = new PaymentResponse();
        res.setPayment_url(session.getUrl());

        return res;

    }

}
