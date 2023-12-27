package com.tarasov;

import com.tarasov.figures.AbstractFigure;
import com.tarasov.figures.Circle;
import com.tarasov.figures.Rectangle;
import com.tarasov.figures.Triangle;

public class FigureTest {
    public static void main(String[] args) {
        AbstractFigure figure = new Circle(2.0);
        System.out.println(figure.findPerimeter());
        System.out.println(figure.findArea());
    }
}
