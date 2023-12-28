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
    public void findPerimeter() {
        double scale = Math.pow(10, 2);
        System.out.println(Math.ceil((3 * side) * scale) / scale);
    }

    @Override
    public void findArea() {
        System.out.println(0.5 * base * height);
    }

    @Override
    public String getFigureName() {
        return "Треугольник";
    }
}
