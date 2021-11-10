package com.besmart.hw2.oop.exNine;

/*Implement a class Car that models a car traveling along the x-axis, consuming gas as it moves. Provide methods to drive by a given number of
miles, to add a given number of gallons to the gas tank, and to get the
current distance from the origin and fuel level. Specify the fuel efficiency
(in miles/gallons) in the constructor. Should this be an immutable class?
Why or why not?*/

public class Car {
    //the fuel efficiency in miles/gallons
    private final double fuelEfficiency;
    private final double tankVolume;
    private double fuelLevel;
    private double curDistance;

    public Car(double fuelEfficiency, double tankVolume) {
        this.fuelEfficiency = fuelEfficiency;
        this.tankVolume = tankVolume;
    }

    public Car(double fuelEfficiency, double tankVolume, double fuelLevel) {
        this.fuelEfficiency = fuelEfficiency;
        this.tankVolume = tankVolume;
        this.fuelLevel = fuelLevel;
    }

    public Car(double fuelEfficiency, double tankVolume, double fuelLevel, double curDistance) {
        this.fuelEfficiency = fuelEfficiency;
        this.tankVolume = tankVolume;
        this.fuelLevel = fuelLevel;
        this.curDistance = curDistance;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public double getCurDistance() {
        return curDistance;
    }

    /*drive returns -1 if there is enough fuel in the tank to drive those miles
               and else returns the miles that the car will go before the gasoline runs out */
    private double driveSub(double miles) {
        if (fuelLevel >= miles/fuelEfficiency) {
            fuelLevel-=miles/fuelEfficiency;
            curDistance+=miles;
            return -1.0;
        } else {
            double res = fuelLevel*fuelEfficiency;
            fuelLevel = 0.0;
            curDistance+=res;
            return res;
        }
    }

    /*addGallons returns 0 if there is enough space in the tank to fill it with the gallons.
       Else the tank fills up completely and returns 1*/
    private int addGallonsSub (double gallons) {
        if (fuelLevel+gallons<=tankVolume) {
            fuelLevel+=gallons;
            return 0;
        } else {
            fuelLevel = tankVolume;
            return 1;
        }
    }

    public void drive (double miles) {
        double res = driveSub(miles);
        if (Double.compare(res, -1.0)==0) System.out.println("You arrived");
        else System.out.println("Unfortunately, there is not enough gas in your tank. You drove "+res+" miles");
    }

    public void addGallons (double gallons) {
        int res = addGallonsSub(gallons);
        if (res==0) System.out.println("Your tank is filled with "+gallons+" gallons");
        else System.out.println("You have entered too many gallons. Your tank is full.");
    }
}
