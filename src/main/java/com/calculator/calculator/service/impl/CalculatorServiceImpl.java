package com.calculator.calculator.service.impl;

import com.calculator.calculator.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public Integer performCalculation(Integer a,Integer b, Character character) {
        if(character=='a'){
            return add(a,b);
        } else if (character=='s') {
            return sub(a,b);
        }else if (character=='m') {
            return mul(a,b);
        }else if (character=='d') {
            return div(a,b);
        }else
            return 0;
    }

    private Integer add(Integer a,Integer b){
        return a+b;
    }

    private Integer sub(Integer a,Integer b){
        return a-b;
    }

    private Integer mul(Integer a,Integer b){
        return a*b;
    }

    private Integer div(Integer a,Integer b){
        return a/b;
    }
}
