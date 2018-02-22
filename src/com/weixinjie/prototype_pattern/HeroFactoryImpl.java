package com.weixinjie.prototype_pattern;

public class HeroFactoryImpl implements HeroFactory {
    General general = null;
    Weapon weapon = null;

    public HeroFactoryImpl(General general, Weapon weapon) {
        this.general = general;
        this.weapon = weapon;
    }

    @Override
    public General createGeneral() {
        return general.copy();
    }

    @Override
    public Weapon createWeapon() {
        return weapon.copy();
    }
}
