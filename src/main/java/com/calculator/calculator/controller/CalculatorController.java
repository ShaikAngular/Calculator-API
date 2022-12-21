package com.calculator.calculator.controller;

import com.calculator.calculator.entity.Variables;
import com.calculator.calculator.service.CalculatorService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;
    @PostMapping("/calculate")
    public String getResult(@RequestBody @NotNull Variables variables){
        return "The result is: "+calculatorService.performCalculation(variables.firstValue, variables.secondValue, variables.flag);
    }

}
