package com.company;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public static void printNumberOfEmployees() {       //Static available to class
        System.out.println(numberOfEmployees);
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (extraHours * hourlyRate);
    }

    private void setBaseSalary(int baseSalary) {        //instance, availalble to objects
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary can not be 0 or less");
        this.baseSalary = baseSalary;
    }
    private int getBaseSalary() {
        return baseSalary;
    }


    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("rate can not be 0 or less");
        this.hourlyRate = hourlyRate;
    }
    private int getHourlyRate() {
        return hourlyRate;
    }
}
