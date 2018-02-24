package com.weixinjie.strategy_pattern;


import com.weixinjie.Logger;

/**
 * 策略模式
 */
public class App {
    public static void main(String[] args) {
        Context context = new Context(new Strategy_Add());
        int add = context.execute(1, 2);
        Logger.e(String.valueOf(add));

        context = new Context(new Strategy_Subtraction());
        int subtraction = context.execute(2, 1);
        Logger.e(String.valueOf(subtraction));
    }
}
