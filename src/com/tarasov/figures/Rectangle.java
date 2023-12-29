package com.tarasov.figures;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rectangle extends AbstractFigure{
    private Double sideA;
    private Double sideB;

    public Rectangle(Double sideA, Double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void findPerimeter() {
        BigDecimal res = BigDecimal.valueOf(2 * (sideA + sideB));
        System.out.println(res.setScale(2, RoundingMode.CEILING));
    }

    @Override
    public void findArea() {
        BigDecimal res = BigDecimal.valueOf(sideA * sideB);
        System.out.println(res.setScale(2, RoundingMode.CEILING));
    }

    @Override
    public String getFigureName() {
        return "Прямоугольник";
    }
}
