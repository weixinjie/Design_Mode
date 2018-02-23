package com.weixinjie.decorator_pattern;

import com.weixinjie.Logger;

public class Decorator_Gun implements Weapon {
    Weapon weapon = null;

    public Decorator_Gun(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void kill() {
        weapon.kill();
        Logger.e("我是Gun的包装类 我在kill");
    }

    @Override
    public void save() {
        weapon.save();
        Logger.e("我是Gun的包装类 我在save");
    }
}
