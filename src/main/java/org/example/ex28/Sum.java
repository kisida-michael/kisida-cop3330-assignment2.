/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Kisida
 */

package org.example.ex28;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

    int n = 5;
    int sum=0;
    Scanner input = new Scanner(System.in);  // Create a Scanner object
    for(int i = 0; i < n; i++){
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        sum = sum + num;
    }
    System.out.println("The total is: " + sum);

    }
}



