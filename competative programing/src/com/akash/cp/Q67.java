package com.akash.cp;

public class Q67 {
    public static String addBinary(String a, String b) {
        int add;
        int first=Integer.parseInt(a);
        int second=Integer.parseInt(b);
        add= first ^ second;
        return String.valueOf(add);
    }
    public static void main(String[] args){
        System.out.println(addBinary("11", "1"));
    }
}
