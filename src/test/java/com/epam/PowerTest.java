package com.epam;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for the Calculator's pow method.
 */
@DisplayName("Power Operation Tests")
public class PowerTest extends BaseCalculatorTest {
    
    @Test 
    @DisplayName("Test raising a positive number to a positive power")
    public void testPositiveNumberToPositivePower() {
        assertEquals(8.0, calculator.pow(2.0, 3.0), 0.0001, 
            "2.0 raised to the power of 3.0 should equal 8.0");
    }
    
    @Test
    @DisplayName("Test raising a negative number to an even power")
    public void testNegativeNumberToEvenPower() {
        assertEquals(9.0, calculator.pow(-3.0, 2.0), 0.0001, 
            "-3.0 raised to the power of 2.0 should equal 9.0");
    }
    
    @Test
    @DisplayName("Test raising a negative number to an odd power")
    public void testNegativeNumberToOddPower() {
        assertEquals(-8.0, calculator.pow(-2.0, 3.0), 0.0001, 
            "-2.0 raised to the power of 3.0 should equal -8.0");
    }
    
    @Test
    @DisplayName("Test raising any number to the power of zero")
    public void testNumberToPowerZero() {
        assertEquals(1.0, calculator.pow(5.0, 0.0), 0.0001, 
            "Any number raised to the power of 0.0 should equal 1.0");
    }
}
