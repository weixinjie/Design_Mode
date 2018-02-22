package com.weixinjie.bridge_pattern;

import com.weixinjie.Logger;

/**
 * 刀
 */
public class Weapon_Sword implements Weapon {
    private Enchantment enchantment;

    public Weapon_Sword(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        Logger.e("刀在 wield");

    }

    @Override
    public void swing() {
        Logger.e("刀在 swing");
    }

    @Override
    public void unwield() {
        Logger.e("刀在 unwield");
    }

    @Override
    public Enchantment getEnchantment() {
        return this.enchantment;
    }
}
