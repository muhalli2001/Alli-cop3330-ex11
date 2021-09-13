package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        Scanner euro = new Scanner(System.in);
        System.out.println("What is the amount in euros?");
        float euros = euro.nextFloat();
        System.out.println(euros);

        Scanner rate = new Scanner(System.in);
        System.out.println("What is the current exchange rate(Euros to U.S dollar)");
        float RATE = rate.nextFloat();
        System.out.println(RATE);

        double ndollars = RATE*euros;

        System.out.println(ndollars); //before rounding



        ndollars = Math.round(ndollars * 100.0) / 100.0;

        System.out.println(ndollars+ " U.S Dollars"); //after rounding


    }
}
