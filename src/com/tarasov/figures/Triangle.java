package com.tarasov.figures;

public class Triangle extends AbstractFigure{
    private Double base;
    private Double height;
    private Double side;

    public Triangle(Double base, Double height, Double side) {
        this.base = base;
        this.height = height;
        this.side = side;
    }

    @Override
    public double findPerimeter() {
        double scale = Math.pow(10, 2);
        return Math.ceil((3 * side) * scale) / scale;
    }

    @Override
    public double findArea() {
        return 0.5 * base * height;
    }
}
