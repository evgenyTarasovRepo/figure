package com.tarasov.figures;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
        BigDecimal res = BigDecimal.valueOf(3 * side);
        System.out.println(res.setScale(2, RoundingMode.CEILING));
    }

    @Override
    public void findArea() {
        BigDecimal res = BigDecimal.valueOf(0.5 * base * height);
        System.out.println(res.setScale(2, RoundingMode.CEILING));
    }

    @Override
    public String getFigureName() {
        return "Треугольник";
    }
}
