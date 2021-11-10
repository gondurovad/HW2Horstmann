package com.besmart.hw2.programmingStructures;
import java.util.Scanner;

/*Write a program that reads an integer and prints it in binary, octal, and
hexadecimal. Print the reciprocal as a hexadecimal floating-point number.*/

public class ExsOne {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.println("You entered: "+num);
        System.out.println("Binary: " + Integer.toBinaryString(num));
        System.out.println("Octal: " + Integer.toOctalString(num));
        System.out.println("Hexadecimal: " + Integer.toHexString(num));
        System.out.println("The reciprocal as a hexadecimal floating-point number: " + Float.toHexString(1/((float)num)));
    }
}
