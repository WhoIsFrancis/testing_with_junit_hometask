package com.epam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DivisionTest extends BaseCalculatorTest{
    @Test
    @DisplayName("Divide two positive numbers")
    public void testDividePositiveNumbers() {
        assertEquals( 1, calculator.div( 5, 5 ), "Dividing 5 and 5 should equal 1"  );
    }

    @Test
    @DisplayName("Divide one positive and one negative number")
    public void testDividePositiveAndNegativeNumbers() {
        assertEquals( -1, calculator.div( 5, -5 ), "Dividing 5 and -5 should equal -1"  );
    }

    @Test
    @DisplayName("Divide two negative numbers")
    public void testDivideNegativeNumbers() {
        assertEquals( 1, calculator.div( -5, -5 ), "Dividing -5 and -5 should equal 1"  );
    }
}
