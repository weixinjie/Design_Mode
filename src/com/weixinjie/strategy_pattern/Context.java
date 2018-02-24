package com.weixinjie.strategy_pattern;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int execute(int num1, int num2) {
        return this.strategy.execute(num1, num2);
    }
}
