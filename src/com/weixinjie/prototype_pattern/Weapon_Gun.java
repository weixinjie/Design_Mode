package com.weixinjie.prototype_pattern;

/**
 * 枪是武器的一种
 */
public class Weapon_Gun extends Weapon {
    private String name;

    /**
     * 设置两种类型的构造器
     *
     * @param name
     */
    public Weapon_Gun(String name) {
        this.name = name;
    }


    public Weapon_Gun(Weapon_Gun weapon_gun) {
        this.name = weapon_gun.name;
    }

    @Override
    public Weapon copy() {
        return new Weapon_Gun(this);
    }

    @Override
    public String toString() {
        return "Weapon_Gun{" +
                "name='" + name + '\'' +
                '}';
    }
}
