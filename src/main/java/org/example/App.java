/*
 *  UCF COP3330 Fall 2021 Assignment 21 Solution
 *  Copyright 2021 Andrew Howard
 */
package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int numMonth ;
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Please enter the number of the month: ");
        numMonth = keyboardInput.nextInt();



        switch(numMonth){
            case 1: System.out.print("The name of the month is January");
            break;
            case 2: System.out.print("The name of the month is February");
            break;
            case 3: System.out.print("The name of the month is March");
            break;
            case 4: System.out.print("The name of the month is April");
            break;
            case 5: System.out.print("The name of the month is May");
            break;
            case 6: System.out.print("The name of the month is June");
            break;
            case 7: System.out.print("The name of the month is July");
            break;
            case 8: System.out.print("The name of the month is August");
            break;
            case 9: System.out.print("The name of the month is September");
            break;
            case 10: System.out.print("The name of the month is October");
            break;
            case 11: System.out.print("The name of the month is November");
            break;
            case 12: System.out.print("The name of the month is December");
            break;
            default: System.out.print("Error. Try again.");
        }


    }
}
