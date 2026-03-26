package com.paint;

public class Circle extends Shape {

    private float radius;
    private Point center;

    public Circle(Point center, float radius) {
        this.center = center;
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public void draw(DrawingContext context) {
        System.out.println("Drawing Circle with radius :" + radius);
    }
}