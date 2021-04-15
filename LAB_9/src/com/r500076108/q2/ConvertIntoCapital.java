package com.r500076108.q2;

import java.util.Scanner;

public class ConvertIntoCapital {
    public static void main(String[] args){
        StringBuffer st=new StringBuffer();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter string = ");
        String string =sc.next();
        for(int i=0;i<string.length();i++){
            char ch=string.charAt(i);
            if(ch>=97&& ch<=122){
                ch=(char)((ch-32));
                st.append(ch);
            }
        }
        System.out.println(st.toString());

    }
}
