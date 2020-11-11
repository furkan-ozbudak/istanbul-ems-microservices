package com.furkanozbudak.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/employeeServiceFallBack")
    public String employeeServiceFallBackMethod() {
        return "Employee Service is taking longer than expected." +
                " Please try again later.";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBackMethod() {
        return "Department Service is taking longer than expected." +
                " Please try again later.";
    }

    @GetMapping("/addressServiceFallBack")
    public String addressServiceFallBack() {
        return "Address Service is taking longer than expected." +
                " Please try again later.";
    }
}
