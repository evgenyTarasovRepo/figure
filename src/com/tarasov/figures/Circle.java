package com.tarasov.figures;

public class Circle extends AbstractFigure{
    private Double r;
    double scale = Math.pow(10, 2);

    public Circle(Double r) {
        this.r = r;
    }

    @Override
    public void findPerimeter() {
        System.out.println(Math.ceil((2 * Math.PI * r) * scale) / scale);
    }

    @Override
    public void findArea() {
        System.out.println(Math.ceil((Math.PI * r * r) * scale) / scale);
    }

    @Override
    public String getFigureName() {
        return "Окружность";
    }
}
