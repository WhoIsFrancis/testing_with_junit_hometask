package com.epam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Addition Operation Tests")
public class AdditionTest extends BaseCalculatorTest {
    @Test
    @DisplayName("Add two positive numbers")
    public void testAddPositiveNumbers() {
        assertEquals( 8, calculator.sum( 5, 3 ), "Adding 5 and 3 should equal 8"  );
    }

    @Test
    @DisplayName("Add one positive and one negative number")
    public void testAddPositiveAndNegativeNumbers() {
        assertEquals( 2, calculator.sum( 5, -3 ), "Adding 5 and -3 should equal 2"  );
    }

    @Test
    @DisplayName("Add two negative numbers")
    public void testAddNegativeNumbers() {
        assertEquals( -8, calculator.sum( -5, -3 ), "Adding -5 and -3 should equal -8"  );
    }

    @Test
    @DisplayName("Add zero to a number")
    public void testAddZeroToNumber() {
        assertEquals( 5, calculator.sum( 5, 0 ), "Adding 5 and 0 should equal 5"  );
    }

    @Test
    @DisplayName("Add two large positive numbers")
    public void testAddLargePositiveNumbers() {
        assertEquals( 1000000000, calculator.sum( 500000000, 500000000 ), "Adding 500000000 and 500000000 should equal 1000000000"  );
    }
}
