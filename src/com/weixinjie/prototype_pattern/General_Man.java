package com.weixinjie.prototype_pattern;

public class General_Man extends General {
    private String name;

    public General_Man(String name) {
        this.name = name;
    }

    public General_Man(General_Man man) {
        this.name = man.name;
    }

    @Override
    public General copy() {
        return new General_Man(this);
    }

    @Override
    public String toString() {
        return "General_Man{" +
                "name='" + name + '\'' +
                '}';
    }
}
