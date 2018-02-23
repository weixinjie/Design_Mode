package com.weixinjie.facade_pattern;

import com.weixinjie.Logger;

public class Circle implements Shape {
    @Override
    public void draw() {
        Logger.e("我是Circle我正在draw");
    }
}
