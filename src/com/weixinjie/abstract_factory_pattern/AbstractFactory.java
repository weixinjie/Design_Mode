package com.weixinjie.abstract_factory_pattern;

public abstract class AbstractFactory {
    abstract Color getColor(String type);

    abstract Shape getShape(String shape);
}
