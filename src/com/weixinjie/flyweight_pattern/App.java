package com.weixinjie.flyweight_pattern;


import com.weixinjie.Logger;

import java.util.HashMap;
import java.util.Random;

/**
 * 享元模式
 * 核心就是将对象缓存到内存中,减少类的创建数量
 */
public class App {
    public static void main(String[] args) {
        Shape circle = null;

        String[] colors = new String[]{"red", "blue", "green", "black", "yello"};
        HashMap<String, Shape> caches = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            String color = colors[new Random().nextInt(5)];
            if (caches.containsKey(color)) {
                circle = caches.get(color);
                Logger.e("享元模式找到了");
            } else {
                circle = new Circle(color);
                caches.put(color, circle);
                Logger.e("享元模式没找到");
            }
        }


    }
}
