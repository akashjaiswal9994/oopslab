package com.s500076108.sonnet.assignmnet;

public class Q2 {
    public static void main(String[] args){
        int n=6;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
