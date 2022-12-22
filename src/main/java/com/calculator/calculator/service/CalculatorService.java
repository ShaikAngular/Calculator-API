package com.calculator.calculator.service;

import org.springframework.stereotype.Service;

@Service
public interface CalculatorService {
    public Number performCalculation(Number a,Number b, Character character);
}