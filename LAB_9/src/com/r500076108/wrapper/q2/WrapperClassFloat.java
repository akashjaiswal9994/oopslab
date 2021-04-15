package com.r500076108.wrapper.q2;

public class WrapperClassFloat {
    public static void main(String args[]){
        float a =6;
        Float i1=new Float(a);
        String s1=new String(i1.toString());
        float a2=Float.parseFloat(s1);
        System.out.println("float value = "+a);
        System.out.println("float to Float = "+i1);
        System.out.println("Float to String = "+s1);
        System.out.println("String to float = "+a2);
        float s3=4;
        String s2=String.valueOf(s3);
        Float i2= new Float(s2);
        float a3=i2.floatValue();
        System.out.println("float to String = "+s3);
        System.out.println("String to Float = "+i2);
        System.out.println("Float to float = "+a3);

    }
}
