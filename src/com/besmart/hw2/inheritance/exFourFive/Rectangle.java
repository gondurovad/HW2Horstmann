package com.besmart.hw2.inheritance.exFourFive;

import com.besmart.hw2.oop.exFive.Point;

public class Rectangle extends Shape{
    double length;
    double width;

    public Rectangle(Point topLeft, double length, double width) {
        super(new Point(topLeft.getX()+length/2, topLeft.getY()-width/2));
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public Point getCenter() {
        return this.center;
    }

    @Override
    public String toString() {
        return "Rectangle[center=("+center.getX()+","+center.getY()+
                "), length="+length+", width="+width+"]";
    }

    public Rectangle clone() {
        Point topLeft = new Point(this.center.getX()-length/2, this.center.getY()+width/2);
        return new Rectangle(topLeft, this.length, this.width);
    }
}
