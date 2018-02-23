package com.weixinjie.facade_pattern;

/**
 * 增加一个图形制作类,封装了所有图形的绘制
 */
public class ShapeMaker {
    private Shape circle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
