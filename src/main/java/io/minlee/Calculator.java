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

    public static double divide(double value, double divisor) throws ArithmeticException{
        if(divisor == 0) {
            throw new ArithmeticException("Cannot divide by 0");
        }
        return value/divisor;
    }


}