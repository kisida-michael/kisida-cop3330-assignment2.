package org.example.ex34;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Kisida
 */

import java.util.Scanner;

public class EmployeeRemoval {

  public static void remove(String removal, String[] names) {
      String[] nameCpy = new String[names.length-1];
      int numIndex = 5;
      switch (removal) {
          case "John Smith":
              numIndex = 0;
              break;
          case "Jackie Jackson":
              numIndex =1;
              break;
          case "Chris Jones":
              numIndex =2;
              break;
          case "Amanda Cullen":
              numIndex =3;
              break;
          case "Jeremy Goodwin":
              numIndex =4;
              break;
      }
      for (int i = 0, j = 0; i < names.length; i++) {
          if (i != numIndex) {
              nameCpy[j++] = names[i];
          }
      }
      System.out.println("There are 4 employees");
      for (String s : nameCpy) {
          System.out.println(s);
      }


}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        String[] names = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        System.out.print("Enter an employee name to remove: ");
        String inputName = input.nextLine();
        remove(inputName, names);

    }
}
