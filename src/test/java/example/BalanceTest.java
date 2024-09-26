package example;

import org.example.Balance;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BalanceTest {
    @Test
    public void testLeftHeavier() {
        Balance balance = new Balance();

        // Перенаправляем вывод в поток
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out; // Сохраняем оригинальный System.out
        System.setOut(new PrintStream(outputStream)); // Перенаправляем вывод

        balance.addLeft(5);
        balance.addRight(3);
        balance.result(); // Ожидаем "L"
        assertEquals("L", outputStream.toString().trim());

        // Восстанавливаем оригинальный System.out
        System.setOut(originalOut);
    }

    @Test
    public void testEqualWeight() {
        Balance balance = new Balance();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        balance.addLeft(5);
        balance.addRight(5);
        balance.result(); // Ожидаем "="
        assertEquals("=", outputStream.toString().trim());

        System.setOut(originalOut);
    }

    @Test
    public void testRightHeavier() {
        Balance balance = new Balance();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        balance.addLeft(3);
        balance.addRight(5);
        balance.result(); // Ожидаем "R"
        assertEquals("R", outputStream.toString().trim());

        System.setOut(originalOut);
    }
}