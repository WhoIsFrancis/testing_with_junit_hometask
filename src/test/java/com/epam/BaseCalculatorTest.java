package com.epam;

import org.junit.jupiter.api.TestInstance;

import com.epam.tat.module4.Calculator;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class BaseCalculatorTest 
{
    protected Calculator calculator;
    @BeforeAll
    public void setUp()
    {
        calculator = new Calculator();
        System.out.println("Calculator instance created for " + this.getClass().getSimpleName());
    }

    @AfterAll
    public void tearDown()
    {
        calculator = null;
        System.out.println("Calculator instance destroyed for " + this.getClass().getSimpleName() + "\n");
    }
}
