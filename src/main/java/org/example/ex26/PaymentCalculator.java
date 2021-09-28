package org.example.ex26;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Kisida
 */

import java.util.Scanner;
import java.lang.Math;

public class PaymentCalculator {

    public static double calculateMonthsUntilPaidOff(double i, double b, double p){
        double n =  Math.log10(1.0 + b/p) * Math.pow((1.0 - (1.0 + i)), 30.0);


        System.out.println(n);
        return n;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.print("What is your balance? ");
        double balance = input.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        double apr = input.nextDouble();
        apr = (apr/36500.0);
        System.out.print("What is the monthly payment you can make? ");
        double monthlyPayment = input.nextDouble();
        double months = calculateMonthsUntilPaidOff(apr, balance, monthlyPayment);
        System.out.println(months);

    }
}
