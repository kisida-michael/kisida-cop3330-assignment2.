/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Kisida
 */

package org.example.ex24;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static boolean isAnagram(String word1, String word2) {
        String output;
        boolean result = true;

        if (word1.length() != word2.length()) {
            result = false;
        } else {
            char[] word1Arr = word1.toLowerCase().toCharArray();
            char[] word2Arr = word2.toLowerCase().toCharArray();
            Arrays.sort(word1Arr);
            Arrays.sort(word2Arr);
            result = Arrays.equals(word1Arr, word2Arr);
        }

        if (result) {
           output = String.format("\"%s\" and \"%s\" are anagrams", word1, word2);
        } else {
            output = String.format("\"%s\" and \"%s\" are not anagrams", word1, word2);
        }
        System.out.println(output);
        return result;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter String 1: ");
        String str1 = input.nextLine();
        System.out.print("Enter String 2: ");
        String str2 = input.nextLine();
        isAnagram(str1, str2);


    }
}



