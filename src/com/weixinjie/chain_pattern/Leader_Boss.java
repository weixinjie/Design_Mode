package com.weixinjie.chain_pattern;

import com.weixinjie.Logger;

public class Leader_Boss extends Leader {
    /**
     * 含参的构造方法
     *
     * @param expenses
     */
    public Leader_Boss(int expenses) {
        super(expenses);
    }

    @Override
    protected void reply(ProgramApes programApes) {
        Logger.e("我是大老板  我已经处理了");
    }
}
