package example;

import org.example.Button;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ButtonTest {
    @Test
    public void testClick() {
        Button button = new Button();
        button.click();
        assertEquals(1, button.getClickCount());
    }
}
