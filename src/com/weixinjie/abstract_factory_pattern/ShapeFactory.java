package com.weixinjie.abstract_factory_pattern;

public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String type) {
        return null;
    }

    @Override
    Shape getShape(String type) {
        Shape shape = null;
        switch (type) {
            case "circle":
                shape = new Shape_Circle();
                break;
            case "rectangle":
                shape = new Shape_Rectangle();
                break;
            case "square":
                shape = new Shape_Square();
                break;
            default:
                break;
        }
        return shape;
    }
}
