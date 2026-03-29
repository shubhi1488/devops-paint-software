package com.paint;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WindowTest {

    @Test
    void testOpen() {
        Window w = new Window();
        assertDoesNotThrow(w::open);
    }

    @Test
    void testDisplay() {
        Window w = new Window();
        assertDoesNotThrow(w::display);
    }
    @Test
    void testWindowFail() {
        Window w = new Window();

        // expecting exception (but none occurs → fail)
        assertThrows(Exception.class, w::open);
    }
}