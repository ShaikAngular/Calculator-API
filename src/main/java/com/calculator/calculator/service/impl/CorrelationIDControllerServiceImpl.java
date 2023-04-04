package com.calculator.calculator.service.impl;

import com.calculator.calculator.service.CorrelationIDControllerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CorrelationIDControllerServiceImpl implements CorrelationIDControllerService {
    @Override
    public String correlation() {
        log.info("Entered correlation");
        return "Correlation ID";
    }
}
