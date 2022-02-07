package com.akash.cp;

import java.util.HashSet;
import java.util.Iterator;

public class Q389 {
    public static void main(String[] args ){
     String arr1= "abcd";
     String  arr2="abcde";
     char c=0;
     HashSet<Character> cc1=new HashSet<Character>();
     for(char c1:arr1.toCharArray()){
        c^=c1;
     }
        HashSet<Character> cc2=new HashSet<Character>();
        for(char c2:arr2.toCharArray()){
            c^=c2;
        }
        System.out.println(c);


    }
}
