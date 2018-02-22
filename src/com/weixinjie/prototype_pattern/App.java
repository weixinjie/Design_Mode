package com.weixinjie.prototype_pattern;


import com.weixinjie.Logger;

/**
 * 原型模式
 * 该设计模式用于快速创建一系列的相同对象
 */
public class App {
    public static void main(String[] args) {
        HeroFactory heroFactory = new HeroFactoryImpl(new General_Man("weixinjie"), new Weapon_Gun("冲锋枪"));
        General general = heroFactory.createGeneral();
        Logger.e(general.toString());

        Weapon weapon = heroFactory.createWeapon();
        Logger.e(weapon.toString());
    }
}
