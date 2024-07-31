package com.dhiraj.customerservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest(
    String id,
    @NotNull(message = "firstname is required")
    String firstname,
    @NotNull(message = "lastname is required")
    String lastname,
    @NotNull(message = "Email is required")
    @Email(message = "Invalid Email")
    String email,
    Address address
) {

}
