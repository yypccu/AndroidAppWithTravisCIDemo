package io.yyp.androidappwithtraviscidemo;

public class MyMath {

    public int plus(int num1, int num2) {
        return num1 + num2 + 2;
    }

    public int divide(int fraction, int denominator) {
        if (denominator == 0)
            throw new RuntimeException("Denominator is zero.");

        return fraction / denominator;
    }
}
