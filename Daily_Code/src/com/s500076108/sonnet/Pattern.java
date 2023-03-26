package com.s500076108.sonnet;



public class Pattern {
    public static void  main(String args[]){
        int n=5;

            int x=fibonacciRecursion(n);
            System.out.println();
            for(int j=0;j<x;j++){
                System.out.print("*");
            }

        }

    public static int fibonacciRecursion(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
    }


}
