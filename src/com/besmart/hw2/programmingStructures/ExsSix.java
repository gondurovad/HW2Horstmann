package com.besmart.hw2.programmingStructures;
import java.math.BigInteger;

/*Write a program that computes the factorial n! = 1 × 2 × . . . × n, using
BigInteger. Compute the factorial of 1000.*/

public class ExsSix {

    public static void main(String[] args) {
        System.out.println(factorial(1000));
    }

    public static BigInteger factorial(int n)
    {
        BigInteger res = BigInteger.valueOf(1);
        if(n < 0)
            throw new IllegalArgumentException("Factorial of negative number is undefined");
        else if( n == 0 || n == 1) return res;
        else {
            for (int i = 2; i <= n; i++)
                res = res.multiply(BigInteger.valueOf(i));
            return res;
        }
    }
}
