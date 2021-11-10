package com.besmart.hw2.programmingStructures;

import java.util.Scanner;

/*Using only the conditional operator, write a program that reads three
integers and prints the largest. Repeat with Math.max.*/

public class ExsThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second integer number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter third integer number: ");
        int num3 = scanner.nextInt();
        scanner.close();

        int max = (num1>num2?num1:num2)>num3 ? (num1>num2?num1:num2) : num3;
        System.out.println("Max of "+num1+","+num2+","+num3+" is "+max);
        System.out.println("Max by Math.max: " + Math.max(num1, Math.max(num2, num3)));
    }
}
