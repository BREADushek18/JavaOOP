package org.example;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddEvenSeparatorTest {
    @Test
    public void testEvenNumbers() {
        OddEvenSeparator separator = new OddEvenSeparator();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        separator.addNumber(10);
        separator.addNumber(22);
        separator.addNumber(31);
        separator.addNumber(14);
        separator.addNumber(507);

        separator.even();

        assertEquals("Чётные числа: 10 22 14", outputStream.toString());

        System.setOut(originalOut);
    }

    @Test
    public void testOddNumbers() {
        OddEvenSeparator separator = new OddEvenSeparator();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        separator.addNumber(10);
        separator.addNumber(22);
        separator.addNumber(31);
        separator.addNumber(14);
        separator.addNumber(507);

        separator.odd();

        assertEquals(" Нечётные числа: 31 507", outputStream.toString());

        System.setOut(originalOut);
    }
}