package com.paint;

import java.util.Arrays;

public class Frame extends Window {

    public Frame() {
        System.out.println("Frame created");
    }

    public static void main(String[] args) {

        // Frame + Window functionality
        Frame frame = new Frame();
        frame.open();
        frame.move(100, 200);
        frame.display();

        // Event handling
        Event event = new Event("Mouse Click");
        frame.handleEvent(event);

        // Drawing context
        DrawingContext context = new DrawingContext();
        context.setPoint(10, 20);
        context.clearScreen();
        System.out.println("Vertical Size: " + context.getVerticalSize());
        System.out.println("Horizontal Size: " + context.getHorizontalSize());

        // Create shapes
        Point p1 = new Point(5, 5);
        Point p2 = new Point(10, 10);

        Circle circle = new Circle(p1, 7);
        Rectangle rectangle = new Rectangle();
        Polygon polygon = new Polygon();

        // Shape operations
        circle.draw(context);
        rectangle.draw(context);
        polygon.draw(context);

        circle.move(2, 3);
        circle.resize(1.5);
        circle.erase();

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Circumference: " + circle.circumference());

        // Window subclasses
        ConsoleWindow consoleWindow = new ConsoleWindow();
        consoleWindow.display();

        DialogBox dialogBox = new DialogBox();
        dialogBox.showDialog();

        // DataController
        DataController controller = new DataController();
        controller.saveData();
        controller.loadData();

        System.out.println("---- Demo Completed ----");
    }
}