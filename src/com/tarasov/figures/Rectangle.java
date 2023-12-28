package com.tarasov.figures;

public class Rectangle extends AbstractFigure{
    private Double sideA;
    private Double sideB;

    public Rectangle(Double sideA, Double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void findPerimeter() {
        System.out.println(2 * (sideA + sideB));
    }

    @Override
    public void findArea() {
        System.out.println(sideA * sideB);
    }

    @Override
    public String getFigureName() {
        return "Прямоугольник";
    }
}
