package org.example;

public class Balance {
    private int leftWeight;
    private int rightWeight;

    public Balance() {
        this.leftWeight = 0;
        this.rightWeight = 0;
    }

    public void addLeft(int weight) {
        leftWeight += weight;
    }

    public void addRight(int weight) {
        rightWeight += weight;
    }

    public void result() {
        if (leftWeight > rightWeight) {
            System.out.println("L");
        } else if (rightWeight > leftWeight) {
            System.out.println("R");
        } else {
            System.out.println("=");
        }
    }
}