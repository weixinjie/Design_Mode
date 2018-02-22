package com.weixinjie.abstract_factory_pattern;


import com.weixinjie.factory_patern.Circle;

/**
 * 抽象工厂模式
 * 该模式是围绕一个超级工厂创建其他的工厂类
 */
public class App {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape shape = shapeFactory.getShape("circle");
        shape.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color red = colorFactory.getColor("red");
        red.fill();
    }
}
