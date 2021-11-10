package com.besmart.hw2.interfaces.exOneTwo;

public class Main {
    static public void main (String[] args) {
        Employee emp1 = new Employee(1, "Sam", "Smith", 1023);
        Employee emp2 = new Employee(2, "Carrie", "Smith", 1000);
        Employee emp3 = new Employee(3, "Tom", "Park", 2010);

        Employee[] dep1 = {emp1, emp2, emp3};

        System.out.println("Average salary in dep 1: " + Employee.averageSalary(dep1));
        System.out.println("Largest salary in dep 1: " + Employee.largestSalary(dep1));
    }
}
