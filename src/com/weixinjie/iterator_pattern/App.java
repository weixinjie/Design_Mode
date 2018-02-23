package com.weixinjie.iterator_pattern;


import com.weixinjie.Logger;

/**
 * 迭代器模式
 */
public class App {
    public static void main(String[] args) {
        NameResp nameResp = new NameResp();
        Iterator iterator = nameResp.getIterator();
        while (iterator.hasNext()) {
            String name = (String) iterator.next();
            Logger.e(name);
        }
    }
}
