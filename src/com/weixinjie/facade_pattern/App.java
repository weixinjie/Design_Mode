package com.weixinjie.facade_pattern;


/**
 * 外观模式
 * 增加一个类来隐藏系统的复杂性
 */
public class App {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawSquare();
    }
}
