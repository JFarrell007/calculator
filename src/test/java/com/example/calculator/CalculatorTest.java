package com.example.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator = new Calculator();
    
    @Test
    public void testSum(){
        assertEquals(5, calculator.sum(2,3));
    }

    @Test
    public void testSubtract(){
        assertEquals(5, calculator.subtract(10, 5));
    }
    @Test
    public void testDivide(){
        assertEquals(5, calculator.divide(25.0,5.0));
    }

    
}
