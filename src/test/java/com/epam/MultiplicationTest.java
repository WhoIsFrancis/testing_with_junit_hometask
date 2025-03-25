package com.epam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Multiplication Operation Tests")
public class MultiplicationTest extends BaseCalculatorTest{
    @Test
    @DisplayName("Multiply two positive numbers")
    public void testMultiplyPositiveNumbers() {
        assertEquals( 15, calculator.mult( 5, 3 ), "Multiplying 5 and 3 should equal 15"  );
    }

    @Test
    @DisplayName("Multiply one positive and one negative number")
    public void testMultiplyPositiveAndNegativeNumbers() {
        assertEquals( -15, calculator.mult( 5, -3 ), "Multiplying 5 and -3 should equal -15"  );
    }

    @Test
    @DisplayName("Multiply two negative numbers")
    public void testMultiplyNegativeNumbers() {
        assertEquals( 15, calculator.mult( -5, -3 ), "Multiplying -5 and -3 should equal 15"  );
    }

    @Test
    @DisplayName("Multiply one positive and one zero number")
    public void testMultiplyPositiveAndZeroNumbers() {
        assertEquals( 0, calculator.mult( 5, 0 ), "Multiplying 5 and 0 should equal 0"  );
    }

    @Test
    @DisplayName("Multiply one negative and one zero number")
    public void testMultiplyNegativeAndZeroNumbers() {
        assertEquals( 0, calculator.mult( -5, 0 ), "Multiplying -5 and 0 should equal 0"  );
    }

    @Test
    @DisplayName("Multiply one zero and one zero number")
    public void testMultiplyZeroAndZeroNumbers() {
        assertEquals( 0, calculator.mult( 0, 0 ), "Multiplying 0 and 0 should equal 0"  );
    }

    @Test
    @DisplayName("Multiply one positive and one large number")
    public void testMultiplyPositiveAndLargeNumbers() {
        assertEquals( 1500000000, calculator.mult( 500000000, 3 ), "Multiplying 500000000 and 3 should equal 1500000000"  );
    }
}
