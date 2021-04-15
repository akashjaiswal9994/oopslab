package com.r500076108.wrapper.q1;

public class WrapperClassCheck {
    public static void main(String args[]){
        int a =6;
        Integer i1=new Integer(a);
        String s1=new String(i1.toString());
        int a2=Integer.parseInt(s1);
        System.out.println("int value = "+a);
        System.out.println("int to Integer = "+i1);
        System.out.println("Integer to String = "+s1);
        System.out.println("String to int = "+a2);
        int s3=4;
        String s2=String.valueOf(s3);
        Integer i2= new Integer(s2);
        int a3=i2.intValue();
        System.out.println("int to String = "+s3);
        System.out.println("String to Integer = "+i2);
        System.out.println("Integer to int = "+a3);

    }
}
