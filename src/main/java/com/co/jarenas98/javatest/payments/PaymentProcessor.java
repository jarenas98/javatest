package com.co.jarenas98.javatest.payments;

import com.co.jarenas98.javatest.payments.PaymentResponse.PaymentStatus;

public class PaymentProcessor {

    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean makePayment(double amount) {
        PaymentResponse paymentResponse = this.paymentGateway.requestPayment(new PaymentRequest(amount));

        if (paymentResponse.getStatus() == PaymentStatus.OK) {
            return true;
        } else {
            return false;
        }
    }
}
