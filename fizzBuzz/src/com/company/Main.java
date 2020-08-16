package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Number: ");
        Scanner number = new Scanner(System.in);
        int enteredNumber = number.nextInt();

        if (enteredNumber % 15 ==0)
            System.out.println("FizzBuzz");
        else if (enteredNumber % 5 == 0)
            System.out.println("Buzz");
        else if (enteredNumber % 3 == 0)
            System.out.println("Fizz");
        else System.out.println(enteredNumber);
    }
}
