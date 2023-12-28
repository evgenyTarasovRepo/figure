package com.tarasov;

import com.tarasov.figures.AbstractFigure;
import com.tarasov.figures.Circle;
import com.tarasov.figures.Rectangle;
import com.tarasov.figures.Triangle;

import java.util.ArrayList;
import java.util.Scanner;

public class FigureTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<AbstractFigure> figureList = new ArrayList<>();

        System.out.println("Введите семь фигур: т - треугольник, о - окружность, п - прямоугольник");

        while (figureList.size() != 7) {
            switch (scanner.nextLine()) {
                case "т":
                    System.out.println("Введите значение основания, высоты и одной стороны треугольника");
                    System.out.println("Основание: ");
                    Double base = Double.parseDouble(scanner.nextLine());
                    System.out.println("Высота: ");
                    Double height = Double.parseDouble(scanner.nextLine());
                    System.out.println("Сторона: ");
                    Double side = Double.parseDouble(scanner.nextLine());
                    figureList.add(new Triangle(base, height, side));
                    break;
                case "о":
                    System.out.println("Введите значение радиуса окружности");
                    System.out.println("Радиус: ");
                    Double r = Double.parseDouble(scanner.nextLine());
                    figureList.add(new Circle(r));
                    break;
                case "п":
                    System.out.println("Введите значение сторон прямоугольника");
                    System.out.println("Сторона А: ");
                    Double a = Double.parseDouble(scanner.nextLine());
                    System.out.println("Сторона В: ");
                    Double b = Double.parseDouble(scanner.nextLine());
                    figureList.add(new Rectangle(a, b));
                    break;
            }
        }

    }
}
