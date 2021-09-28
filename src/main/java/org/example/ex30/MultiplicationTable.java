package org.example.ex30;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Kisida
 */

public class MultiplicationTable {
    public static void main(String[] args) {
        int[][] multiplicationTable = new int[12][12];


        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                multiplicationTable[i][j] = (i+1)*(j+1);
                System.out.format("%4d", multiplicationTable[i][j]);
                if ((j+1) == 12) System.out.println();
            }
        }
    }
}
