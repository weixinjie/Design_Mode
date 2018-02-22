package com.weixinjie.factory_patern;

import com.weixinjie.Logger;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        Logger.e("我是Rectangle");
    }
}
