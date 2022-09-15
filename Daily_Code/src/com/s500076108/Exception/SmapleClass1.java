package com.s500076108.Exception;

import java.io.IOException;

public class SmapleClass1 {
    public static void main(String [] args){

        try{
            //System.out.println(c);
            String aa=null;
            int c,a=10,b=0;
            c=a/b;
            int[] arr={9};
            System.out.println(arr[2]);
            System.out.println(aa.length());
            System.out.println(c);
        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println(ae);
            System.out.println("Array index out of bond catch block ");
        }
        catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("Arithmetic exception catch block");
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("executing exception catch block" );
        }


    }
}
