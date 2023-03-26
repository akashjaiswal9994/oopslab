package com.s500076108.sonnet;

import java.util.Scanner;

public class SquareSum {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("value "+ (i+1)+": ");
         arr[i]=sc.nextInt();
        }

        int sum=0;
        for(int i=0;i<10;i++){
           arr[i]=arr[i]*arr[i];
           sum+=arr[i];
        }
        System.out.println(sum);
        for(int i=41 ;i<250;i++){
        }
    }

}
