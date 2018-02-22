package com.weixinjie.factory_patern;

/**
 * 工厂模式
 */
public class App {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape("circle");
        shape.draw();

        Shape shape1 = ShapeFactory.getShape("rectangle");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("square");
        shape2.draw();

    }
}
