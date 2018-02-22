package com.weixinjie.factory_patern;

public class ShapeFactory {
    public static Shape getShape(String type) {
        Shape shape = null;
        switch (type) {
            case "circle":
                shape = new Circle();
                break;
            case "rectangle":
                shape = new Rectangle();
                break;
            case "square":
                shape = new Square();
                break;
            default:
                break;
        }
        return shape;
    }
}
