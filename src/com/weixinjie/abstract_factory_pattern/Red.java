package com.weixinjie.abstract_factory_pattern;

import com.weixinjie.Logger;

public class Red implements Color {
    @Override
    public void fill() {
        Logger.e("我是红色的颜色");
    }
}
