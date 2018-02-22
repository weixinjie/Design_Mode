package com.weixinjie.composite_pattern;

import com.weixinjie.Logger;

import java.util.List;

/**
 * 单词
 */
public class Word extends LetterComposite {
    public Word(List<Letter> letters) {
        for (Letter letter : letters) {
            this.add(letter);
        }
    }

    @Override
    protected void printThisBefore() {
        Logger.e(" ");
    }
}
