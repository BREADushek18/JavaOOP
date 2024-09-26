package org.example;

import java.util.Scanner;

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
}
