package com.akash.cp;

import java.util.Scanner;

public class Ques1 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);

        int T=sc.nextInt();
        while(T>0){
            int N,C;

            N=sc.nextInt();
            C=sc.nextInt();
            int temp=N-C;
            if(C==0){
                System.out.println(N);
            }
            if(C<N){
                C=C*2;
                N=temp+C;
                System.out.println(N);
            }
            else if(C==N){
                C=C+C-1;
                System.out.println(C);
            }
            T--;
        }
        // your code goes here
    }
}
