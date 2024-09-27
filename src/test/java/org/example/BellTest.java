package org.example;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BellTest {

    @Test
    public void testSoundOnce() {
        Bell bell = new Bell();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        bell.sound();

        assertEquals("ding ", outputStream.toString());

        System.setOut(originalOut);
    }

    @Test
    public void testSoundTwice() {
        Bell bell = new Bell();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        bell.sound();
        bell.sound();

        assertEquals("ding dong ", outputStream.toString());

        System.setOut(originalOut);
    }

}