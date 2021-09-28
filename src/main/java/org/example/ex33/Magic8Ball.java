package org.example.ex33;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Kisida
 */

import java.util.Random;
import java.util.Scanner;


public class Magic8Ball {

    public static int random() {

        Random rand = new Random();
        int choice = rand.nextInt(3);
        return choice;
        }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.print("What's your question? ");
        String str2 = input.nextLine();
        String str1 ="";
        int choice = random();
        switch (choice) {
            case 0:
                str1 = "Yes";
                break;
            case 1:
                str1 = "No";
                break;
            case 2:
                str1 = "Maybe";
                break;
            case 3:
                str1 = "Ask again Later";
                break;
        }
        System.out.println("> "+ str1);
    }
}
