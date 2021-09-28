package org.example.ex25;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Kisida
 */

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class PasswordValidator {
    public static void strength(String pass){
        int passStatus;
        Pattern my_pattern = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher specialChar = my_pattern.matcher(pass);
        boolean special = specialChar.find();
        boolean letters = pass.matches("[a-zA-Z]+");
        boolean numbers = pass.matches("[1-9]+");
        if(numbers && pass.length() < 8 && !letters) {
            System.out.println("very weak");
            passStatus =1;
        }

        if(pass.length() < 8 && letters && !numbers) {
            System.out.println("weak");
            passStatus = 0;
        }
        if(special && pass.length() >= 8 && numbers){
            System.out.println("verystrong");
        }

    }
    public static void main(String[] args) {

        String password = args[0];
        strength(password);

    }
}
