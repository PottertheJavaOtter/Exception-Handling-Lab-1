package io.minlee;

/**
 * Created by minlee on 5/17/16.
 */
public class Calculator {

    public static double add(double value1, double value2) {
        return value1 + value2;
    }

    public static double subtract(double value1, double value2){
        return value1 - value2;
    }

    public static double multiply(double value1, double value2){
        return value1*value2;
    }

    public static double divide(double value, double divisor) throws DivisionByZeroException {
        if(divisor == 0) {
            throw new DivisionByZeroException("Cannot divide by 0");
        }
        return value/divisor;
    }


    public static double squareRoot(int value) throws ComplexNumberException{
        if(value < 0){
            throw new ComplexNumberException("Complex number result");
        }
        return Math.sqrt(value);
    }
}
