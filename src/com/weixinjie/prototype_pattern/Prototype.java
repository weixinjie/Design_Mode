package com.weixinjie.prototype_pattern;

/**
 * 原型抽象类
 */
public abstract class Prototype implements Cloneable {
    public abstract Object copy() throws CloneNotSupportedException;
}
