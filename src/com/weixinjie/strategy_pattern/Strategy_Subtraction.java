package com.weixinjie.strategy_pattern;

public class Strategy_Subtraction implements Strategy {
    @Override
    public int execute(int num1, int num2) {
        return num1 - num2;
    }
}
