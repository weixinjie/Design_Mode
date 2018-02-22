package com.weixinjie.builder_pattern;

/**
 * 职业
 */
public enum Profession {
    TEACHER, CODING;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
