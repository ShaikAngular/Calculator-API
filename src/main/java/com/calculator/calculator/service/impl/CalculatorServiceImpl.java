package com.calculator.calculator.service.impl;

import com.calculator.calculator.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public Number performCalculation(Number a,Number b, Character character) {
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

    private Number add(Number a,Number b){
        return a.floatValue()+b.floatValue();
    }

    private Number sub(Number a,Number b){
        return a.floatValue()-b.floatValue();
    }

    private Number mul(Number a,Number b){
        return a.floatValue()*b.floatValue();
    }

    private Number div(Number a,Number b){
        return a.floatValue()/b.floatValue();
    }
}
