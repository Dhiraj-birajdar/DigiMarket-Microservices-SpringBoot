package com.dhiraj.orderservice.payment;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
    name = "payment-service",
    url = "${app.url.payment-service}"
)
public interface PaymentClient {

  @PostMapping
  public ResponseEntity<Integer> requestOrderPayment(@RequestBody PaymentRequest request);
}
