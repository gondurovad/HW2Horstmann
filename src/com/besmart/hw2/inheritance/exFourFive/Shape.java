package com.besmart.hw2.inheritance.exFourFive;

import com.besmart.hw2.oop.exFive.Point;

public abstract class Shape {
    protected Point center;
    public Shape(Point center) {
        this.center = new Point(center.getX(), center.getY());
    }
    public void moveBy(double dx, double dy) {
        center.translate(dx, dy);
    }
    public abstract Point getCenter();
}
