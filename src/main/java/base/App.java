package base;

/*

 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sahar Sheikholeslami

 */

/*
Exercise 21 - Numbers to Names
Many programs display information to the end user in one form but use a
different form inside the program.
For example, you may show the word Blue on the screen,
but behind the scenes you’ll have a numerical value for that color or an internal value because
you may need to represent the textual description in another language for Spanish-speaking visitors.

Write a program that converts a number from 1 to 12 to the corresponding month.
Prompt for a number and display the corresponding calendar month,
with 1 being January and 12 being December.
For any value outside that range, display an appropriate error message.

Example Output
Please enter the number of the month: 3
The name of the month is March.

Constraints
Use a switch or case statement for this program.
Use a single output statement for this program.

Challenges
Use a map or dictionary to remove the switch statement from the program.
Support multiple languages. Prompt for the language at the beginning of the program.

 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;
        String monthName;

        System.out.print("Please enter the number of the month: ");
        choice = Integer.parseInt(input.nextLine());
        while (choice>12 || choice <0) {

            System.out.print("Invalid value, please enter a number between 1 to 12: ");
            choice = Integer.parseInt(input.nextLine());
        }

        switch(choice){

            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            default:
                monthName = "December";

        }

        System.out.print("The name of the month is " + monthName + ".");

    }
}
