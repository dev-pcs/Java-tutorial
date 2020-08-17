package com.company;

import java.text.NumberFormat;

public class MortgageReport {
    public static void heading(String name) {
        System.out.println(" ");
        System.out.println(name);
        System.out.println("-".repeat(name.length()));
    }

    public static void displayAmount(double formatAmount) {
        NumberFormat amount = NumberFormat.getCurrencyInstance();
        System.out.println(amount.format(formatAmount));
    }
}
