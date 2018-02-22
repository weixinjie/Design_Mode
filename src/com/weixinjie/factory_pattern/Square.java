package com.weixinjie.factory_pattern;

import com.weixinjie.Logger;

public class Square implements Shape {
    @Override
    public void draw() {
        Logger.e("我是Square");
    }
}
