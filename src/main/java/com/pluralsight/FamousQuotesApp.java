package com.pluralsight;

import java.util.Scanner;

public class FamousQuotesApp {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

    try {
        // create an array of 10 quotes
        String[] quotes = {"Be yourself", "Keep going", "Stay curious",
                "Less is more", "Do it now", "Dream big", "Choose joy", "Start small",
                "Never stop learning", "This too shall pass"};

        System.out.println("Please enter a number 1 through 10: ");
        int input = myscanner.nextInt();
        // so user can still access quotes[0]
        input--;
        System.out.println("Quote of the Day:");
        System.out.println(quotes[input]);
    } catch (RuntimeException e) {
        System.out.println("Your number was out of range!");
        System.out.println(e.getMessage());
    }
    }
}
