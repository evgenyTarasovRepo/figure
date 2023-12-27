package com.tarasov.figures;

public class Rectangle extends AbstractFigure{
    private Double sideA;
    private Double sideB;

    public Rectangle(Double sideA, Double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double findPerimeter() {
        return 2 * (sideA + sideB);
    }

    @Override
    public double findArea() {
        return sideA * sideB;
    }
}
