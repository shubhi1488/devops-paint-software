package com.paint;

import java.util.ArrayList;
import java.util.List;

public class Window {

    protected List<Shape> shapes = new ArrayList<>();

    public void open() {
        System.out.println("Window opened");
    }

    public void close() {
        System.out.println("Window closed");
    }

    public void move(int x, int y) {
        System.out.println("Window moved to " + x + "," + y);
    }

    public void display() {
        System.out.println("Displaying window");
    }

    public void handleEvent(Event event) {
        System.out.println("Handling event: " + event.getType());
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }
}