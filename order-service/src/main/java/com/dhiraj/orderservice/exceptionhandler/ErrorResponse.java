package com.dhiraj.orderservice.exceptionhandler;

import java.util.Map;

public record ErrorResponse(
    Map<String, String> errors
) {

}
