package com.dhiraj.orderservice.kafka;



import com.dhiraj.notificationservice.kafka.order.Customer;
import com.dhiraj.notificationservice.kafka.order.Product;
import com.dhiraj.notificationservice.kafka.payment.PaymentMethod;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        Customer customer,
        List<Product> products

) {
}
