package com.s500076108;

import java.util.Scanner;

public class LeethcodeDay1 {
    public static String makeFancyString(String s) {
  int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            for(int j=0;j<s.length();j++){
                if(c==s.charAt(j)){
                    count++;
                    if(count>=3){
                        s=s.substring(0, j) + s.substring(j+1);
                        count=0;
                    }


                }
            }
           i++;
        }
     return s;

    }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String ss=sc.next();
        String result=makeFancyString(ss);
        System.out.println("answer= "+result);
    }
}
