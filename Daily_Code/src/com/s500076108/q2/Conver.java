package com.s500076108.q2;

import java.util.Scanner;

public class Conver {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        double AUS_Dollar = 1.80;
        double CHI_Yuan = 9.11;
        double IND_Rupee = 104.78;
        double JPN_Yen = 151.24;
        double PAK_Rupee = 213.81;
        double US_Dollar = 1.40;
        double UAE_Dirham = 5.14;

        System.out.println("--------------Welcome to the Currency Converter----------");
        System.out.print("Enter a Country whose Currency you want to change: ");
        String country1 = sc.nextLine();

        double amountToChange;
        System.out.println("Enter the Amount to be converted: ");
        amountToChange = sc.nextDouble();
        System.out.println(amountToChange);
        double amountInPounds;
        double amountChanged;

        switch(country1)
        {
            case "USA":
                amountInPounds = (amountToChange/US_Dollar);
                break;
            case "AUS":
                amountInPounds = (amountToChange/AUS_Dollar);
                break;
            case "PAK":
                amountInPounds = (amountToChange/PAK_Rupee);
                break;
            case "UAE":
                amountInPounds = (amountToChange/UAE_Dirham);
                break;
            case "INDIA":
                amountInPounds = (amountToChange/IND_Rupee);
                break;
            case "CHINA":
                amountInPounds = (amountToChange/CHI_Yuan);
                break;
            case "JAPAN":
                amountInPounds = (amountToChange/JPN_Yen);
                break;
            default: amountInPounds = 0.0;
        }
        System.out.println(amountInPounds);

        System.out.print("Enter a Country to which you want to change the entered currency: ");
        String country2 = sc.next();

        switch(country2)
        {
            case "USA":
                amountChanged = amountInPounds*US_Dollar;
                break;
            case "AUS":
                amountChanged = amountInPounds*AUS_Dollar;
                break;
            case "PAK":
                amountChanged = amountInPounds*PAK_Rupee;
                break;
            case "UAE":
                amountChanged = amountInPounds*UAE_Dirham;
                break;
            case "INDIA":
                amountChanged = amountInPounds*IND_Rupee;
                break;
            case "CHINA":
                amountChanged = amountInPounds*CHI_Yuan;
                break;
            case "JAPAN":
                amountChanged = amountInPounds*JPN_Yen;
                break;
            default:
                amountChanged = 0.0;

        }
        System.out.println("The Converted amount is: "+amountChanged);

    }
}
