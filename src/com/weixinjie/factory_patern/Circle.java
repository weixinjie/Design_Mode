package com.weixinjie.factory_patern;

import com.weixinjie.Logger;

public class Circle implements Shape {
    @Override
    public void draw() {
        Logger.e("我是Circle");
    }
}
