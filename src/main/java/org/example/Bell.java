package org.example;

public class Bell {
    private boolean isDing;

    public Bell() {
        this.isDing = true; // Начинаем с "ding"
    }

    public void sound() {
        if (isDing) {
            System.out.print("ding ");
        } else {
            System.out.print("dong ");
        }
        isDing = !isDing; // Переключаем состояние

    }
}
