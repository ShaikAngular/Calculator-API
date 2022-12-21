package com.calculator.calculator.service;

import org.springframework.stereotype.Service;

@Service
public interface CalculatorService {
    public Integer performCalculation(Integer a,Integer b, Character character);
}