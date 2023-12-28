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


        int counter = 7;
        while (figureList.size() != 7) {
            System.out.println("Введите " + counter + " фигур: т - треугольник, о - окружность, п - прямоугольник");
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
                    counter--;
                    break;
                case "о":
                    System.out.println("Введите значение радиуса окружности");
                    System.out.println("Радиус: ");
                    Double r = Double.parseDouble(scanner.nextLine());
                    figureList.add(new Circle(r));
                    counter--;
                    break;
                case "п":
                    System.out.println("Введите значение сторон прямоугольника");
                    System.out.println("Сторона А: ");
                    Double a = Double.parseDouble(scanner.nextLine());
                    System.out.println("Сторона В: ");
                    Double b = Double.parseDouble(scanner.nextLine());
                    figureList.add(new Rectangle(a, b));
                    counter--;
                    break;
            }
            System.out.println("Вам отсталось добавить " + counter + " фигур");
        }

        while (true) {
            System.out.println("Введите цифру от 1 до 7 чтобы выбрать фигуру для работы или введите '0' для выхода: ");

            int figureIndex = Integer.parseInt(scanner.nextLine());
            if (figureIndex == 0) {
                System.out.println("Вы вышли!");
              break;
            }
            AbstractFigure figure = figureList.get(figureIndex-1);

            boolean flag = true;
            while (flag) {
                System.out.println("Вы выбрали: " + figure.getFigureName());
                System.out.println("Доступны действия: 1) Нажмите 1, чтобы рассчитать периметр, " +
                        "2)Нажмите 2 чтобы ассчитать площадь, 3) Нажмите 3 чтобы сменить фигуру");
                String input = scanner.nextLine();
                switch (input) {
                    case "1" :
                        System.out.print("Периметр равен: ");
                        figure.findPerimeter();
                        break;
                    case "2" :
                        System.out.print("Площадь равна: ");
                        figure.findArea();
                        break;
                    case "3" :
                        flag = false;
                        break;
                }
            }

        }

    }
}
