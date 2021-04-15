package com.r500076108.q1;

import java.util.Scanner;

public class SearchChar {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String letter="abcdefghijklmnopqrabsctudvewfxgyhzijklmnopqstuvwxyz";
        System.out.println("enter the char");
       String qa=sc.next();
       System.out.println("first occurrence of string "+letter.indexOf(qa));
        System.out.println("last occurrence of string "+letter.lastIndexOf(qa));
    }
}
