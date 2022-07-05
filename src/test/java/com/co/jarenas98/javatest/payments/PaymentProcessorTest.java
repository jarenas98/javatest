package com.co.jarenas98.javatest.payments;

import com.co.jarenas98.javatest.payments.PaymentResponse.PaymentStatus;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    private PaymentGateway paymentGateway;
    private PaymentProcessor paymentProcessor;

    @Before
    public void setup() {
        this.paymentGateway = Mockito.mock(PaymentGateway.class);
        this.paymentProcessor = new PaymentProcessor(paymentGateway);
    }

    @Test
    public void payment_is_correct() {
        Mockito.when(this.paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentStatus.OK));

        assertTrue(this.paymentProcessor.makePayment(1000));
    }

    @Test
    public void payment_is_wrong() {
        Mockito.when(this.paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentStatus.ERROR));

        assertFalse(this.paymentProcessor.makePayment(1000));
    }
}