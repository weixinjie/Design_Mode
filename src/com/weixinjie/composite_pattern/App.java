package com.weixinjie.composite_pattern;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 组合模式
 */
public class App {
    public static void main(String[] args) {

        List<Word> words = new ArrayList<>();
        words.add(new Word(Arrays.asList(
                new Letter('h')
                , new Letter('e')
                , new Letter('l')
                , new Letter('l')
                , new Letter('o'))));
        words.add(new Word(Arrays.asList(
                new Letter('w')
                , new Letter('o')
                , new Letter('r')
                , new Letter('e'))));

        LetterComposite letterComposite = new Sentence(words);
        letterComposite.print();

    }
}
