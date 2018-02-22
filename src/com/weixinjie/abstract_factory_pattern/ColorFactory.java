package com.weixinjie.abstract_factory_pattern;

public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String type) {
        Color color = null;
        switch (type) {
            case "red":
                color = new Red();
                break;
            case "blue":
                color = new Blue();
                break;
        }
        return color;
    }

    @Override
    Shape getShape(String type) {
        return null;
    }
}
