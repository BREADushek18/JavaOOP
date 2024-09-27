package org.example;
import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;
import Exceptions.InvalidRadiusException;
import Exceptions.NegativeHeightException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GeometricShapesTest {
    @Test
    public void testCircle() {
        try {
            Circle circle = new Circle(5);
            assertEquals(78.53981633974483, circle.area(), 0.01);
            assertEquals("Круг с радиусом: 5.0", circle.toString());
        } catch (InvalidRadiusException e) {
            fail("Исключение не должно быть выброшено");
        }

        assertThrows(InvalidRadiusException.class, () -> new Circle(0));
        assertThrows(InvalidRadiusException.class, () -> new Circle(-1));
    }

    @Test
    public void testRectangle() {
        Rectangle rectangle = new Rectangle(4, 6);
        assertEquals(24, rectangle.area());
        assertEquals("Прямоугольник с шириной: 4.0 и высотой: 6.0", rectangle.toString());

        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-1, 5));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(4, 0));
    }

    @Test
    public void testCylinder() {
        try {
            Circle circle = new Circle(5);
            Cylinder cylinder = new Cylinder(circle, 10);
            assertEquals(785.3981633974483, cylinder.volume(), 0.01);
            assertEquals("Круг с радиусом: 5.0 и высотой: 10.0", cylinder.toString());

            assertThrows(NegativeHeightException.class, () -> new Cylinder(circle, -1));
            assertThrows(NegativeHeightException.class, () -> new Cylinder(circle, 0));
        } catch (InvalidRadiusException | NegativeHeightException e) {
            fail("Исключение не должно быть выброшено");
        }
    }
}