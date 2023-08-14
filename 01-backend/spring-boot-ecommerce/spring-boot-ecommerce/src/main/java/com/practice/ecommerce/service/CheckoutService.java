package com.practice.ecommerce.service;

import com.practice.ecommerce.dto.PaymentInfo;
import com.practice.ecommerce.dto.Purchase;
import com.practice.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
