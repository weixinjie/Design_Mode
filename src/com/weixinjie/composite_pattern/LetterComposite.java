package com.weixinjie.composite_pattern;

import com.weixinjie.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * 信件的构成要素
 */
public abstract class LetterComposite {
    private List<LetterComposite> letterComposites = new ArrayList<>();

    public void add(LetterComposite letterComposite) {
        this.letterComposites.add(letterComposite);
    }

    public int count() {
        return letterComposites.size();
    }

    protected void printThisBefore() {
    }

    protected void printThisAfter() {
    }

    public void print() {
        printThisBefore();
        for (LetterComposite letterComposite : letterComposites) {
            letterComposite.print();
        }
        printThisAfter();
    }
}
