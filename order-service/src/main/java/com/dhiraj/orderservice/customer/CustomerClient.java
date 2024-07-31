package com.dhiraj.orderservice.customer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(
    name = "customer-service",
    url = "${app.url.customer-service}"
)
public interface CustomerClient {

  @GetMapping("/{customer-id}")
  Optional<CustomerResponse> findCustomerById(@PathVariable("customer-id") String customerId);
}
