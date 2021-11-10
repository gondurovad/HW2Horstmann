package com.besmart.hw2.programmingStructures;

/*Write a program that prints the smallest and largest positive double values.
Hint: Look up Math.nextUp in the Java API.*/

public class ExsFour {
    public static void main(String[] args) {
        System.out.println("The smallest positive double value: " + Math.nextUp(-0.0));
        System.out.println("The largest positive double value: " + Math.nextDown(Double.POSITIVE_INFINITY));
    }
}
