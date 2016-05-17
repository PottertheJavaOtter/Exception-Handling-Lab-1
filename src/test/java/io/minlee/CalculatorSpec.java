package io.minlee;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Created by minlee on 5/17/16.
 */
public class CalculatorSpec {

    Calculator calculator;
    double delta = 10e-15;

    @Rule
    public ExpectedException thrown = ExpectedException.none();


    @Before
    public void initialize(){
        calculator = new Calculator();
    }
    @Test
    public void addTest(){
        double expectedValue = 2;
        double actualValue = Calculator.add(1,1);
        assertEquals(expectedValue,actualValue,delta);
    }
    @Test
    public void subtractTest(){
        double expectedValue = 0;
        double actualValue = Calculator.subtract(1,1);
        assertEquals(expectedValue,actualValue,delta);
    }
    @Test
    public void multiplyTest(){
        double expectedValue = 1;
        double actualValue = Calculator.multiply(1,1);
        assertEquals(expectedValue,actualValue,delta);
    }
    @Test
    public void divideTest(){
        double expectedValue = 1;
        double actualValue = Calculator.divide(1,1);
        assertEquals(expectedValue,actualValue,delta);
    }
    @Test
    public void divideBy0ExceptionTest(){
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage("Cannot divide by 0");
        Calculator.divide(1,0);
    }
}
