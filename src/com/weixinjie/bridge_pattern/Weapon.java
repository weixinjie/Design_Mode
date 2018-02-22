package com.weixinjie.bridge_pattern;

/**
 * 武器
 */
public interface Weapon {
    void wield();

    void swing();

    void unwield();

    Enchantment getEnchantment();
}
