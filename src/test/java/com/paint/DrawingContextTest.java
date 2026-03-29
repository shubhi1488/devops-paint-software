package com.paint;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DrawingContextTest {

    @Test
    void testSizes() {
        DrawingContext dc = new DrawingContext();

        assertTrue(dc.getVerticalSize() > 0);
        assertTrue(dc.getHorizontalSize() > 0);
    }
    @Test
    void testVerticalSizeFail() {
        DrawingContext dc = new DrawingContext();

        assertEquals(0, dc.getVerticalSize()); // wrong
    }
}