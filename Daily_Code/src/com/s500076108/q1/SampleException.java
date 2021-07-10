package com.s500076108.q1;

public class SampleException {
    public static void main(String args[]){
        try{
            int a=9,b=0,c;
            c=a/b;
            System.out.println("sum = "+c);

        }catch (ArithmeticException e){
            System.out.println("can not dived number by zero");
        }
        try {
            double z= 4.5;
            String str = "sun.arch.data.model";
            int x=Integer.getInteger(str);
            System.out.println(x);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try{
            int a[]=new int[5];
            a[10]=15;
        }catch (Exception e){
            System.out.println("array index out of  bond");
        }
    }

}
