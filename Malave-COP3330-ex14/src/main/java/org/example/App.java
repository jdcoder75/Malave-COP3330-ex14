package org.example;
import java.util.Scanner;


/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Jose Malave
 */
public class App
{
    public static void main( String[] args )
    {

        Scanner sc= new Scanner(System.in);
        String state = "WI";

         final double tax = 0.055;

        System.out.println( "What is the order amount?" );
        String orderIn= sc.nextLine();

        System.out.println( "What is the state? " );
        String stateIn = sc.nextLine();

        double order = Double.parseDouble(orderIn);
        double subtotal = Math.round(order * 100)/100;
        double total = Math.round(order * 100)/100;

        if(stateIn.contains(state))
        {
            double newTax = (subtotal * tax);
            total = subtotal + newTax;
            System.out.println( "The subtotal is $" + subtotal + ".\n" +
                    "The tax is $" + newTax + "." );
        }
        System.out.println( "The total is $" + total +"." );

    }
}

