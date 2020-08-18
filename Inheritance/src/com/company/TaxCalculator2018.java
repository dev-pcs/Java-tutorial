package com.company;

public class TaxCalculator2018 implements TaxCalculator {
    private double taxableIncome;

    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override           //IMPLEMENTING
    public double calculateTax() {
        return taxableIncome * 0.3;
    }
}
