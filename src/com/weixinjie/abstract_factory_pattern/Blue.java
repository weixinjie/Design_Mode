package com.weixinjie.abstract_factory_pattern;

import com.weixinjie.Logger;

public class Blue implements Color {
    @Override
    public void fill() {
        Logger.e("我是Blue的颜色");
    }
}
