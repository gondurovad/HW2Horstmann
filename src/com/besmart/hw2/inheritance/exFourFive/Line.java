package com.besmart.hw2.inheritance.exFourFive;

import com.besmart.hw2.oop.exFive.Point;

public class Line extends Shape{
    private Point from;
    private Point to;

    public Line(Point from, Point to) {
        super(new Point((from.getX()+to.getX())/2, (from.getX()+to.getX())/2));
        this.from = from;
        this.to = to;
    }

    public Point getFrom() {
        return from;
    }

    public Point getTo() {
        return to;
    }

    @Override
    public Point getCenter() {
        return this.center;
    }

    @Override
    public String toString() {
        return "Line[("+from.getX()+","+from.getY()+"), ("+to.getX()+","+to.getY()+")]";
    }

    public Line clone() {
        Point from = new Point(this.from.getX(), this.from.getY());
        Point to = new Point(this.to.getX(), this.to.getY());
        return new Line(from, to);
    }
}
