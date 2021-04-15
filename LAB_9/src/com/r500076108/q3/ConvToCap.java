package com.r500076108.q3;

import java.util.Scanner;

public class ConvToCap {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter string = ");
        String string =sc.next();
        for(int i=0;i<string.length();i++){
            char cc=string.charAt(i);
            if(cc>=97 && cc<=122){
                cc=(char)((cc-32));
            }
            System.out.println(cc);
        }

    }
}
