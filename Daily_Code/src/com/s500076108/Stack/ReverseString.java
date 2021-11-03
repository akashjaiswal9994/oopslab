package com.s500076108.Stack;

import java.util.Stack;

public class ReverseString {
    public  static void main(String[]args){
        String st="akash";
        System.out.println(st);
        Stack<Character> str=new Stack<>();
       for(char ch:st.toCharArray()){
           str.push(ch);
       }
        System.out.println(str);
       String rev="";
       while (!str.empty()) {
           rev += str.pop();
       }
        System.out.println(rev);
    }
}
