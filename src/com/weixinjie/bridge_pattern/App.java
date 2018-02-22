package com.weixinjie.bridge_pattern;


/**
 * 桥接模式
 * 适用于多个维度
 */
public class App {
    public static void main(String[] args) {

        Weapon_Hammer hammer = new Weapon_Hammer(new FlyingEnchantment());
        hammer.swing();
        hammer.wield();
        hammer.unwield();

        Weapon_Sword sword = new Weapon_Sword(new FirEnchantment());
        sword.swing();
        sword.wield();
        sword.unwield();

    }
}
