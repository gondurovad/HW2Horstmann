package com.besmart.hw2.oop.exFive;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(3, 4).translate(1,3).scale(0.5);
        Point p1 = new Point().translate(1,1).scale(0.1);
        System.out.println(p+"; "+p1);
    }
}
