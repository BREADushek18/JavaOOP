package org.example;

public class Table {
    private int[][] data;
    private int rows;
    private int cols;

    public Table(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new int[rows][cols];
    }
    // Получить значение из ячейки
    public int getValue(int row, int col) {
        return data[row][col];
    }
    // Установить значение в ячейку
    public void setValue(int row, int col, int value) {
        data[row][col] = value;
    }
    // Вернуть количество строк
    public int rows() {
        return rows;
    }
    // Вернуть количество столбцов
    public int cols() {
        return cols;
    }
    // Перевести таблицу в строку
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] row : data) {
            for (int value : row) {
                sb.append(value).append(" ");
            }
        }
        return sb.toString();
    }
    // Вернуть среднее арифметическое всех значений таблицы
    public double average() {
        int sum = 0;
        int count = 0;
        for (int[] row : data) {
            for (int value : row) {
                sum += value;
                count++;
            }
        }
        return count == 0 ? 0 : (double) sum / count;
    }
}
