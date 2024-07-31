package com.dhiraj.orderservice.config;

import io.swagger.v3.oas.annotations.Hidden;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class HomeController {


    @Hidden
    @GetMapping
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("http://localhost:80/swagger-ui/index.html");
    }
}
