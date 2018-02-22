package com.weixinjie.builder_pattern;

/**
 * 性别
 */
public enum Sex {
    MAN, WOMAN;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
