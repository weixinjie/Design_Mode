package com.weixinjie.adapter_pattern;


/**
 * 适配器模式
 */
public class App {
    public static void main(String[] args) {
        Captain captain = new Captain(new FishingAdaper(new FishingBoat()));
        captain.row();
    }
}
