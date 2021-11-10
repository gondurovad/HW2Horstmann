package com.besmart.hw2.inheritance.exFourFive;

import com.besmart.hw2.oop.exFive.Point;

public class Circle extends Shape{
    private double radius;

    public Circle (Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public Point getCenter() {
        return this.center;
    }

    @Override
    public String toString() {
        return "Circle[center=("+center.getX()+","+center.getY()+"), radius="+radius+"]";
    }

    public Circle clone() {
        Point center = new Point(this.center.getX(), this.center.getY());
        return new Circle(center, radius);
    }
}
