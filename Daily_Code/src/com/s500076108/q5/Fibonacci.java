package com.s500076108.q5;

import java.util.Scanner;

public class Fibonacci {
    public  static int fib(int y){
        if (y<=1)
            return y;
        return fib(y-1)+fib(y-2);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int x;
        System.out.print("Enter the number: ");
        x= sc.nextInt();
        System.out.println("number = "+fib(x));
    }
}
