package com.company;

public class TaxReport {

    private TaxCalculator calculator;       //interface

//    public TaxReport(TaxCalculator calculator) {        //constructor injection
//        this.calculator = calculator;
//    }

    public void show(TaxCalculator calculator) {        //method injection
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

//    public void setCalculator(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }
}
