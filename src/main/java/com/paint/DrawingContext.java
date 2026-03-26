package com.paint;

public class DrawingContext {

    public void setPoint(int x, int y) {
        System.out.println("Drawing point at " + x + "," + y);
    }

    public void clearScreen() {
        System.out.println("Screen cleared");
    }

    public int getVerticalSize() {
        return 800;
    }

    public int getHorizontalSize() {
        return 1200;
    }
}