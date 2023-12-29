package com.tarasov.figures;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends AbstractFigure{
    private Double r;
    double scale = Math.pow(10, 2);

    public Circle(Double r) {
        this.r = r;
    }

    @Override
    public void findPerimeter() {
        BigDecimal res = BigDecimal.valueOf(2 * Math.PI * r);
        System.out.println(res.setScale(2, RoundingMode.CEILING));
    }

    @Override
    public void findArea() {
        BigDecimal res = BigDecimal.valueOf(Math.PI * r * r);
        System.out.println(res.setScale(2, RoundingMode.CEILING));
    }

    @Override
    public String getFigureName() {
        return "Окружность";
    }
}
