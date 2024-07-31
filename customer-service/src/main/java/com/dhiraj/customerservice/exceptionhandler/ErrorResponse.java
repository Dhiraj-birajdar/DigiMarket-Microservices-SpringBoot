package com.dhiraj.customerservice.exceptionhandler;

import java.util.Map;

public record ErrorResponse(
    Map<String, String> errors
) {

}
