package com.weixinjie.chain_pattern;

import com.weixinjie.Logger;

/**
 * leader抽象类
 */
public abstract class Leader {
    /**
     * 当前领导可以报批的金额
     */
    private int expenses;

    /**
     * 上级领导
     */
    private Leader mSuperiorLeader; //上级领导


    /**
     * 含参的构造方法
     *
     * @param expenses
     */
    public Leader(int expenses) {
        this.expenses = expenses;
    }

    /**
     * 设置领导
     *
     * @param mSuperiorLeader
     */
    public void setmSuperiorLeader(Leader mSuperiorLeader) {
        this.mSuperiorLeader = mSuperiorLeader;
    }

    /**
     * 回应程序员
     *
     * @param programApes
     */
    protected abstract void reply(ProgramApes programApes);

    /**
     * 处理请求
     *
     * @param programApes
     */
    public void handleRequest(ProgramApes programApes) {
        //如果当前领导可以处理,直接回应程序员
        if (programApes.getExpenses() < this.expenses) {
            reply(programApes);
        } else {
            if (mSuperiorLeader == null) {
                Logger.e("这他么要的也太多了  咱们公司放不下你");
            } else {
                mSuperiorLeader.handleRequest(programApes);
            }
        }
    }


}
