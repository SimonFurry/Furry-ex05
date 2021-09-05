/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Simon Furry
 */

import java.util.Scanner;

public class Solution05 {
    /*
    Create a program that:
    Prompts for two number inputs
    Print...
    Sum(+), Difference(-), Product(*), and quotient(/) of input numbers
     */

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is the first number? ");
        int UserNum1 = in.nextInt();

        System.out.print("What is the second number? ");
        int UserNum2 = in.nextInt();

        System.out.println(UserNum1 + " + " + UserNum2 + " = " +
                (UserNum1 + UserNum2));
        System.out.println(UserNum1 + " - " + UserNum2 + " = " +
                (UserNum1 - UserNum2));
        System.out.println(UserNum1 + " x " + UserNum2 + " = " +
                (UserNum1 * UserNum2));
        System.out.println(UserNum1 + " / " + UserNum2 + " = " +
                (UserNum1 / UserNum2));
    }

}
