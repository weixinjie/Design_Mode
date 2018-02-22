package com.weixinjie.builder_pattern;


import com.weixinjie.Logger;
import com.weixinjie.abstract_factory_pattern.AbstractFactory;
import com.weixinjie.abstract_factory_pattern.Color;
import com.weixinjie.abstract_factory_pattern.FactoryProducer;
import com.weixinjie.abstract_factory_pattern.Shape;

/**
 * 建造者模式
 * 适用于多个属性不是同一时间设置,比如StringBuilder
 */
public class App {
    public static void main(String[] args) {
        Hero hero = new Hero.Builder("weixinjie")
                .withProfession(Profession.TEACHER)
                .withSex(Sex.WOMAN).build();
        Logger.e(hero.toString());
    }
}
