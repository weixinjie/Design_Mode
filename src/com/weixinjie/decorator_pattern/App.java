package com.weixinjie.decorator_pattern;


/**
 * 装饰器模式
 * 在不改变原有类的基础上增加类的功能
 */
public class App {
    public static void main(String[] args) {
        Weapon weapon = new Weapon_Gun();
        Weapon decorator_gun = new Decorator_Gun(weapon);
        decorator_gun.save();
        decorator_gun.kill();
    }
}
