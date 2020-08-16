package com.company;        //main class belongs to this package

import java.text.NumberFormat;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        int principal           = (int) readNumber("principal", 1000, 1_000_000);
        float annualInterest    = (float)readNumber("annualInterest", 0, 30);
        short period            = (short) readNumber("period", 1, 30);

        double mortgage = calculateMortgage(principal, annualInterest, period);
        heading("MORTGAGE");
        displayAmount(mortgage);

        heading("PAYMENT SCHEDULE");
        paymentSchedule(principal, annualInterest, period);
    }


    public static void displayAmount (double formattedAmount ) {
        NumberFormat amount = NumberFormat.getCurrencyInstance();
        System.out.println(amount.format(formattedAmount));
    }


    public static void heading (String name) {
        System.out.println(" ");
        System.out.println(name);
        System.out.println("-".repeat(name.length()));
    }


    public static void paymentSchedule (int principal,
                                        float annualInterest,
                                        short years) {
        final short MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        float monthlyInterest = annualInterest / (MONTHS_IN_YEAR * PERCENT);
        short noOfPayments = (short)(years * MONTHS_IN_YEAR);

        for (int i=0; i <= noOfPayments; i++) {
            double balance = (principal)
                    * ((Math.pow((1 + monthlyInterest), noOfPayments) - Math.pow((1 + monthlyInterest), i))
                    / ((Math.pow((1 + monthlyInterest), noOfPayments) - 1)));
            
            displayAmount(balance);
        }
    }


    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt + ": ");
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + "& " + max);
        }
        return value;
    }


    public static double calculateMortgage (int principal,
                                            float annualInterest,
                                            short years) {
        final short MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        float monthlyInterest = annualInterest / (MONTHS_IN_YEAR * PERCENT);
        short noOfPayments = (short)(years * MONTHS_IN_YEAR);

        double mortgage = principal * ((monthlyInterest * Math.pow((1 + monthlyInterest), noOfPayments)) / (Math.pow((1 + monthlyInterest), noOfPayments) - 1));
        return mortgage;
    }
}
