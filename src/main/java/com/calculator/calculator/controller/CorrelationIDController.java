package com.calculator.calculator.controller;

import com.calculator.calculator.service.CorrelationIDControllerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CorrelationIDController {
    private final CorrelationIDControllerService correlationIDControllerService;

    public CorrelationIDController(CorrelationIDControllerService correlationIDControllerService) {
        this.correlationIDControllerService = correlationIDControllerService;
    }

    @GetMapping("/correlation")
    public String correlationID(){
        log.info("Entered correlation endpoint");
        return correlationIDControllerService.correlation();
    }
}
