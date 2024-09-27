package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TableTest {

    @Test
    public void testTable() {
        Table table = new Table(3, 4);

        // Проверяем количество строк и столбцов
        assertEquals(3, table.rows());
        assertEquals(4, table.cols());

        // Устанавливаем значения
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

        // Проверяем значения
        assertEquals(1, table.getValue(0, 0));
        assertEquals(2, table.getValue(0, 1));
        assertEquals(5, table.getValue(1, 0));
        assertEquals(6, table.getValue(1, 1));
        assertEquals(11, table.getValue(2, 2));
        assertEquals(12, table.getValue(2, 3));

        // Проверяем среднее арифметическое
        assertEquals(6.5, table.average(), 0.01);

        // Проверяем строковое представление
        String expectedString = "1 2 3 4 5 6 7 8 9 10 11 12 ";
        assertEquals(expectedString, table.toString());
    }
}
