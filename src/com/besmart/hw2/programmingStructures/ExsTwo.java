package com.besmart.hw2.programmingStructures;

import java.util.Scanner;
import java.lang.Math;

/*Write a program that reads an integer angle (which may be positive or
negative) and normalizes it to a value between 0 and 359 degrees. Try
it first with the % operator, then with floorMod.*/

public class ExsTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an angle: ");
        int angle = scanner.nextInt();
        scanner.close();

        int angleNorm = (angle>=0) ? angle%360 : 360-(-angle%360);
        System.out.println("You entered: " + angle + ", normalized (by %): " + angleNorm);
        //floorMod return the same sign as the divisor
        System.out.println("Normalized (by floorMod): " + Math.floorMod(angle, 360));
    }
}
