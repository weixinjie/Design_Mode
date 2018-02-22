package com.weixinjie.prototype_pattern;

/**
 * 将军基类
 */
public abstract class General extends Prototype {
    @Override
    public abstract General copy();
}
