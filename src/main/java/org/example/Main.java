package org.example;

import java.util.Scanner;
import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;
import Exceptions.InvalidRadiusException;
import Exceptions.NegativeHeightException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер задания (от 1 до 6): ");
        int taskNumber = scanner.nextInt();

        switch (taskNumber) {
            case 1:
                ClickButton1();
                break;
            case 2:
                Scales2();
                break;
            case 3:
                Bell3();
                break;
            case 4:
                Separator4();
                break;
            case 5:
                Table5();
                break;
            case 6:
                geometricShapes6();
                break;
            default:
                System.out.println("Некорректный номер задания.");
                break;
        }

        scanner.close();
    }

    private static void ClickButton1() {
        Button button = new Button();
        button.click();
    }

    private static void Scales2() {
        Balance balance = new Balance();
        balance.addLeft(5);
        balance.addRight(3);
        balance.result(); // Выводит "L"

        balance.addRight(2);
        balance.result(); // Выводит "="

        balance.addRight(1);
        balance.result(); // Выводит "R"
    }

    private static void Bell3() {
        Bell bell = new Bell();
        for (int i = 0; i < 10; i++) {
            bell.sound();
        }
    }

    private static void Separator4() {
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(10);
        separator.addNumber(22);
        separator.addNumber(31);
        separator.addNumber(14);
        separator.addNumber(507);
        separator.even();
        separator.odd();
    }

    private static void Table5() {
        Table table = new Table(3, 4); // 3 строки и 4 столбца
        table.setValue(0, 0, 1);
        table.setValue(0, 1, 2);
        table.setValue(0, 2, 3);
        table.setValue(0, 3, 4);
        table.setValue(1, 0, 5);
        table.setValue(1, 1, 6);
        table.setValue(1, 2, 7);
        table.setValue(1, 3, 8);
        table.setValue(2, 0, 9);
        table.setValue(2, 1, 10);
        table.setValue(2, 2, 11);
        table.setValue(2, 3, 12);

        System.out.println("Таблица:");
        System.out.println(table);
        System.out.println("Количество строк: " + table.rows());
        System.out.println("Количество столбцов: " + table.cols());
        System.out.println("Значение в ячейке (1, 2): " + table.getValue(1, 2));
        System.out.println("Перевод таблицы в строку: " + table.toString());
        System.out.println("Среднее арифметическое: " + table.average());
    }

    private static void geometricShapes6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите задачу:");
        System.out.println("1. Площадь круга");
        System.out.println("2. Площадь прямоугольника");
        System.out.println("3. Объем цилиндра");

        int taskNumber = scanner.nextInt();
        switch (taskNumber) {
            case 1:
                calculateCircleArea(scanner);
                break;
            case 2:
                calculateRectangleArea(scanner);
                break;
            case 3:
                calculateCylinderVolume(scanner);
                break;
            default:
                System.out.println("Неверный выбор. Пожалуйста, выберите 1, 2 или 3.");
        }
        scanner.close();
    }

    private static void calculateCircleArea(Scanner scanner) {
        System.out.print("Введите радиус круга: ");
        double radius = scanner.nextDouble();
        try {
            Circle circle = new Circle(radius);
            System.out.println(circle);
            System.out.println("Площадь круга: " + circle.area());
        } catch (InvalidRadiusException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void calculateRectangleArea(Scanner scanner) {
        System.out.print("Введите ширину прямоугольника: ");
        double width = scanner.nextDouble();
        System.out.print("Введите высоту прямоугольника: ");
        double height = scanner.nextDouble();

        if (width <= 0 || height <= 0) {
            System.err.println("Ширина и высота должны быть положительными.");
            return;
        }

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle);
        System.out.println("Площадь прямоугольника: " + rectangle.area());
    }

    private static void calculateCylinderVolume(Scanner scanner) {
        System.out.print("Введите радиус основания цилиндра: ");
        double radius = scanner.nextDouble();
        System.out.print("Введите высоту цилиндра: ");
        double height = scanner.nextDouble();

        try {
            Circle base = new Circle(radius);
            Cylinder cylinder = new Cylinder(base, height);
            System.out.println(cylinder);
            System.out.println("Объем цилиндра: " + cylinder.volume());
        } catch (InvalidRadiusException | NegativeHeightException e) {
            System.err.println(e.getMessage());
        }
    }


}
