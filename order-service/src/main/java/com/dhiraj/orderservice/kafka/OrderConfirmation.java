package com.dhiraj.orderservice.kafka;

import com.dhiraj.orderservice.customer.CustomerResponse;
import com.dhiraj.orderservice.order.PaymentMethod;
import com.dhiraj.orderservice.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
