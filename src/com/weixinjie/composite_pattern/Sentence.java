package com.weixinjie.composite_pattern;

import com.weixinjie.Logger;

import java.util.List;

public class Sentence extends LetterComposite {

    public Sentence(List<Word> words) {
        for (Word word : words) {
            this.add(word);
        }
    }

    @Override
    protected void printThisAfter() {
        Logger.e(".");
    }
}
