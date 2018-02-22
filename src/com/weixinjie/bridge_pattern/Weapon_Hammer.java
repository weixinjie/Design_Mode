package com.weixinjie.bridge_pattern;

import com.weixinjie.Logger;

/**
 * 铁锤
 */
public class Weapon_Hammer implements Weapon {

    Enchantment enchantment;

    public Weapon_Hammer(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        Logger.e("铁锤 wield");
        this.enchantment.onActivate();
    }

    @Override
    public void swing() {
        Logger.e("铁锤 swing");
        this.enchantment.apply();
    }

    @Override
    public void unwield() {
        Logger.e("铁锤 unwield");
        this.enchantment.onDeactivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return this.enchantment;
    }
}
