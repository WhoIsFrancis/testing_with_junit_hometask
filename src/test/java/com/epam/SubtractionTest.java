package com.epam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Sustraction Operation Tests")
public class SubtractionTest extends BaseCalculatorTest {
    @Test
    @DisplayName("Sustract two positive numbers")
    public void testSustractPositiveNumbers() {
        assertEquals( 2, calculator.sub( 5, 3 ), "Sustracting 5 and 3 should equal 2"  );
    }

    @Test
    @DisplayName("Sustract one positive and one negative number")
    public void testSustractPositiveAndNegativeNumbers() {
        assertEquals( 8, calculator.sub( 5, -3 ), "Sustracting 5 and -3 should equal 8"  );
    }

    @Test
    @DisplayName("Sustract two negative numbers")
    public void testSustractNegativeNumbers() {
        assertEquals( -2, calculator.sub( -5, -3 ), "Sustracting -5 and -3 should equal -2"  );
    }

    @Test
    @DisplayName("Sustract zero from a number")
    public void testSustractZeroFromNumber() {
        assertEquals( 5, calculator.sub( 5, 0 ), "Sustracting 5 and 0 should equal 5"  );
    }

    @Test
    @DisplayName("Sustract a number from itself")
    public void testSustractNumberFromItself() {
        assertEquals( 0, calculator.sub( 5, 5 ), "Sustracting 5 and 5 should equal 0"  );
    }

    @Test
    @DisplayName("Sustract a large number from a small number")
    public void testSustractLargeNumberFromSmallNumber() {
        assertEquals( 999999999, calculator.sub( 1000000000, 1 ), "Sustracting 1000000000 and 1 should equal 999999999"  );
    }
}
