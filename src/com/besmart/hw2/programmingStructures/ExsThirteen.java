package com.besmart.hw2.programmingStructures;
import java.util.ArrayList;
import java.util.Collections;

/*Write a program that prints a lottery combination, picking six distinct
numbers between 1 and 49. To pick six distinct numbers, start with an
array list filled with 1...49. Pick a random index and remove the element.
Repeat six times. Print the result in sorted order.*/


public class ExsThirteen {
    public static void main(String[] args) {
        ArrayList<Integer> lotteryNum = new ArrayList<>();
        for (int i = 0; i<49; i++)
            lotteryNum.add(i+1);
        ArrayList<Integer> lotteryComb = new ArrayList<>();
        for (int i = 0; i<6; i++) {
            int rand = (int) (Math.random() * (49-i));
            lotteryComb.add(lotteryNum.get(rand));
            lotteryNum.remove(rand);
        }
        Collections.sort(lotteryComb);
        System.out.println("Your lottery combination: " + lotteryComb);
    }
}
