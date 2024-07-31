package com.dhiraj.orderservice.payment;

import com.dhiraj.orderservice.customer.CustomerResponse;
import com.dhiraj.orderservice.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
