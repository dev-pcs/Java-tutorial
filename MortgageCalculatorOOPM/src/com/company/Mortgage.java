package com.company;

public class Mortgage {
    private static int principal;
    private static double annualInterest;
    private static byte years;

    private static short PERCENT = 100;
    private static short MONTHS_IN_YEAR = 12;

    public Mortgage(int principal, double annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public void calculateMortgage() {

        double monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double calculatedMortgage =  principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        MortgageReport.heading("MORTGAGE");
        MortgageReport.displayAmount(calculatedMortgage);
    }


    public void paymentSchedule() {
        MortgageReport.heading("PAYMENT SCHEDULE");
        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double balance = calculateBalance(month);
            MortgageReport.displayAmount(balance);
        }
    }


    public static double calculateBalance (short numberOfPaymentsMade ) {

        double monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        float numberOfPayments = years * MONTHS_IN_YEAR;

        double calculatedBalance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return calculatedBalance;
    }


}
