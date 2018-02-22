package com.weixinjie.bridge_pattern;

import com.weixinjie.Logger;

public class FlyingEnchantment implements Enchantment {
    @Override
    public void onActivate() {
        Logger.e("FlyingEnchantment 在  onActivate");
    }

    @Override
    public void apply() {
        Logger.e("FlyingEnchantment 在  apply");
    }

    @Override
    public void onDeactivate() {
        Logger.e("FlyingEnchantment 在  onDeactivate");
    }
}
