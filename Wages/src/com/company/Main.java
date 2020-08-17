package com.company;

public class Main {

    public static void main(String[] args) {
        var employee = new Employee();

        employee.setBaseSalary(45000);
        int baseSalary = employee.getBaseSalary();
        System.out.println(baseSalary);

        employee.setHourlyRate(20);
        System.out.println(employee.getHourlyRate());

        int wage = employee.calculateWage(20);
        System.out.println(wage);
    }
}
