package com.weixinjie.decorator_pattern;

import com.weixinjie.Logger;

public class Weapon_Gun implements Weapon {
    @Override
    public void kill() {
        Logger.e("枪在kill");
    }

    @Override
    public void save() {
        Logger.e("枪被save");
    }
}
