package com.calculator.calculator.controller;

import com.calculator.calculator.entity.Variables;
import com.calculator.calculator.service.CalculatorService;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;
    @PostMapping("/calculate")
    public String getResult(@RequestBody @NotNull Variables variables){
        log.info("Entered calculator endpoint");
        return "The result is: "+ calculatorService.performCalculation(variables.firstValue, variables.secondValue, variables.flag);
    }

}
