package com.dhiraj.orderservice.customer;

public record CustomerResponse(
    String id,
    String firstname,
    String lastname,
    String email
) {

}