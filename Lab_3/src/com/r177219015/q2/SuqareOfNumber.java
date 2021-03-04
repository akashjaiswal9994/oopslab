package com.r177219015.q2;

import java.util.Scanner;

public class SuqareOfNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        int squ[]=new int[10];
        int z=0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number -: ");
            array[i] = sc.nextInt();
            squ[i]=array[i]*array[i];
            z+=squ[i];
        }
        System.out.print("Sum of Square of the 10 number = "+z);
    }
}
