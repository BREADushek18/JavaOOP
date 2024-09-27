package geometry2d;

import Exceptions.InvalidRadiusException;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) throws InvalidRadiusException {
        if (radius <= 0) {
            throw new InvalidRadiusException("Радиус должен быть положительным.");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Круг с радиусом: " + radius;
    }
}
