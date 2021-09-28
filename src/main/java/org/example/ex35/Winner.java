package org.example.ex35;

import java.util.Scanner;


public class Winner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        String[] names = new String[1000];
        boolean end = true;
        while (end){
            int i =0;
            System.out.print("Enter an employee name to remove: ");
            names[i] = input.nextLine();
            System.out.println(names[i]);
            i++;
            if(names[i].length() == 0){
                end = false;
            }

        }




    }
}
