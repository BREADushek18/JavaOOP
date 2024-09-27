package geometry3d;

import geometry2d.Figure;
import Exceptions.NegativeHeightException;

public class Cylinder {
    private Figure base;
    private double height;

    public Cylinder(Figure base, double height) throws NegativeHeightException {
        if (height <= 0) {
            throw new NegativeHeightException("Высота должна быть положительной.");
        }
        this.base = base;
        this.height = height;
    }

    public double volume() {
        return base.area() * height;
    }

    @Override
    public String toString() {
        return base + " и высотой: " + height;
    }
}
