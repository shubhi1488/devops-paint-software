package com.paint;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @Test
    void testArea() {
        Circle c = new Circle(new Point(0,0), 5);
        assertEquals(Math.PI * 25, c.area(), 0.001);
    }

    @Test
    void testCircumference() {
        Circle c = new Circle(new Point(0,0), 5);
        assertEquals(2 * Math.PI * 5, c.circumference(), 0.001);
    }
    @Test
    void testAreaFail() {
        Circle c = new Circle(new Point(0,0), 5);

        // WRONG expected value (intentional fail)
        assertEquals(100, c.area(), 0.001);
    }
    @Test
    void testCircumferenceFail() {
        Circle c = new Circle(new Point(0,0), 5);

        assertEquals(10, c.circumference(), 0.001); // wrong
    }
}