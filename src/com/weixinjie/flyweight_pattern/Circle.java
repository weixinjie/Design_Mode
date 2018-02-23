package com.weixinjie.flyweight_pattern;

import com.weixinjie.Logger;

public class Circle implements Shape {

    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        Logger.e("我是Circle我正在绘制  " + color);
    }
}
