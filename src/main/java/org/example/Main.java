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
}
