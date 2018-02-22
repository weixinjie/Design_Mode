package com.weixinjie.prototype_pattern;

/**
 * 武器基类
 */
public abstract class Weapon extends Prototype {
    @Override
    public abstract Weapon copy();
}
