package com.co.jarenas98.javatest.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest paymentRequest);
}
