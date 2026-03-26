package com.paint;

public abstract class Shape {

    public abstract void draw(DrawingContext context);

    public void erase() {
        System.out.println("Shape erased");
    }

    public void move(int x, int y) {
        System.out.println("Shape moved");
    }

    public void resize(double factor) {
        System.out.println("Shape resized");
    }
}