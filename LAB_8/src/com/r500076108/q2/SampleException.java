package com.r500076108.q2;

import java.util.Scanner;

public class SampleException {
    public void div(int a,int b){
        try{
            double c=a/b;
            System.out.println("value = "+c);
        }catch ( ArithmeticException e){
            System.out.println("can not divide a number by zero");
        }
    }
    public static void main(String args[]){
        SampleException se =new SampleException();
        Scanner sc= new Scanner(System.in);
        int x,y;
        System.out.print("Enter the first value = ");
        x=sc.nextInt();
        System.out.print("enter the second value = ");
        y=sc.nextInt();
        se.div(x,y);
    }
}
