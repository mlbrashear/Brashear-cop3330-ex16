
package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //Declare variables
        int age;
        String result;
        Scanner sc = new Scanner(System.in);

        //scan user input
        System.out.println("What is your age?");
        age = sc.nextInt();

        //print findings
        result = (age >= 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";

        System.out.println(result);

        sc.close();
    }
}