package no.viktorij.oblig2;

import java.util.Scanner;
import static no.viktorij.oblig2.LeapYear.isLeapYear;

public class Main {
    public static void main(String[] args)
    {
        String yearIsLeapYearMessage = "The chosen year is a leap year!";
        String yearIsNotLeapYearMessage = "The year is not a leap year!";
        System.out.println("Hi this is a program that tell you if a year \nis a leap year or not.");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the year you want to check:");
        int usersYearInput = userInput.nextInt();

        if (isLeapYear(usersYearInput)) {
            System.out.println(yearIsLeapYearMessage);
        }
        else
            System.out.println(yearIsNotLeapYearMessage);
    }

}
