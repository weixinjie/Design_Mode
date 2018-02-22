package com.weixinjie.composite_pattern;

import com.weixinjie.Logger;

/**
 * 单个的字母
 */
public class Letter extends LetterComposite {
    private char c;

    public Letter(char c) {
        this.c = c;
    }

    @Override
    protected void printThisBefore() {
        Logger.e(String.valueOf(c));
    }
}
