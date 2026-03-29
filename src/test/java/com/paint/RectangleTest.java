package com.paint;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    void testDraw() {
        Rectangle r = new Rectangle();
        DrawingContext context = new DrawingContext();

        assertDoesNotThrow(() -> r.draw(context));
    }
}