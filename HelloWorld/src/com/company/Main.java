package com.company;        //main class belongs to this package

import java.text.NumberFormat;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100


        Scanner p = new Scanner(System.in);
        System.out.print("Principal = ");
        int principal = p.nextInt();

        Scanner a = new Scanner(System.in);
        System.out.print("Annual Interest Rate = ");
        double annualInterest = p.nextDouble() / (MONTH_IN_YEAR * PERCENT);

        Scanner pe = new Scanner(System.in);
        System.out.print("Period = ");
        int period = p.nextInt() * MONTH_IN_YEAR;

        double onePlusRPowN = Math.pow((1 + annualInterest), period);

        Double mortgate = principal * ((annualInterest * onePlusRPowN) / ((onePlusRPowN) - 1));
        NumberFormat amount = NumberFormat.getCurrencyInstance();
        System.out.println("Mortgage = " + amount.format(mortgate) + "/month");
    }
}
