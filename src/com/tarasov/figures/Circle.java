package com.tarasov.figures;

public class Circle extends AbstractFigure{
    private Double r;
    double scale = Math.pow(10, 2);

    public Circle(Double r) {
        this.r = r;
    }

    @Override
    public double findPerimeter() {
        return Math.ceil((2 * Math.PI * r) * scale) / scale;
    }

    @Override
    public double findArea() {

        return Math.ceil((Math.PI * r * r) * scale) / scale;
    }
}
