package com.weixinjie.abstract_factory_pattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type) {
        AbstractFactory factory = null;
        switch (type) {
            case "color":
                factory = new ColorFactory();
                break;
            case "shape":
                factory = new ShapeFactory();
                break;
        }
        return factory;
    }

}
