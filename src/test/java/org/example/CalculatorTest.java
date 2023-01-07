package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import workshop.example.Calculator;

import static org.junit.jupiter.api.Assertions.*;
//klasa testowa w maven kończy się na Test
class CalculatorTest {
        
        @Test
        void add() {
                int l = 5;
                int r = 7;
                Integer expected = 12;
        
                Integer result = Calculator.add(l,r);
        
                Assertions.assertEquals(expected,result);
                
        }
}