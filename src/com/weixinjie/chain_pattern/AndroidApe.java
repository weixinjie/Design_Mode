package com.weixinjie.chain_pattern;

public class AndroidApe extends ProgramApes {
    /**
     * 申请的钱数
     */
    private int expenses;

    private String apply = "我是Android程序员  我要申请money";

    public AndroidApe(int expenses) {
        this.expenses = expenses;
    }

    @Override
    public int getExpenses() {
        return this.expenses;
    }

    @Override
    public String getApply() {
        return this.apply;
    }
}
