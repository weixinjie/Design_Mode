package com.weixinjie.bridge_pattern;

import com.weixinjie.Logger;

public class FirEnchantment implements Enchantment {
    @Override
    public void onActivate() {
        Logger.e("FirEnchantment 在  onActivate");
    }

    @Override
    public void apply() {
        Logger.e("FirEnchantment 在  apply");
    }

    @Override
    public void onDeactivate() {
        Logger.e("FirEnchantment 在  onDeactivate");
    }
}
