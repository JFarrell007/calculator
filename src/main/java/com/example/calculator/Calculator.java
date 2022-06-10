package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class Calculator {
    public int sum(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }
    
    public double divide(double a, double b){
        try{
            return a/b;
        }
        catch(ArithmeticException e){
            System.out.println(e);
            return 0;
        }
    }
}
