package com.besmart.hw2.interfaces.exOneTwo;

public class Employee implements Measurable{
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private static double average (Measurable[] objects) {
        int n = objects.length;
        double sum = 0;
        for (Measurable obj: objects)
            sum+=obj.getMeasure();
        return sum/n;
    }

    public static double averageSalary (Employee... employees) {
        return average(employees);
    }

    private static Measurable largest (Measurable[] objects) {
        int n = objects.length;
        Measurable largest = objects[0];
        for (Measurable obj: objects)
            if (Double.compare(obj.getMeasure(),largest.getMeasure())==1) {
                largest = obj;
            }
        return largest;
    }

    public static Employee employeeWithLargestSalary (Employee... employees) {
        return (Employee)largest(employees);
    }

    public static double largestSalary (Employee... employees) {
        return employeeWithLargestSalary(employees).getMeasure();
    }
}
