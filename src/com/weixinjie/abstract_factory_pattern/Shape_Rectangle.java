package com.weixinjie.abstract_factory_pattern;

import com.weixinjie.Logger;

public class Shape_Rectangle implements Shape {
    @Override
    public void draw() {
        Logger.e("我是Rectangle");
    }
}
