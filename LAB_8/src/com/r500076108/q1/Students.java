package com.r500076108.q1;

import java.util.Scanner;

public class Students {
   public static void main(String args[]){
       Scanner sc =new Scanner(System.in);
       String name[]=new String[10];
       int rollNo[]=new int[10];
       try {


           for (int i = 0; i < 2; i++) {
               System.out.print("enter Student "+i+" name = ");
               name[i] = sc.next();
               System.out.print("Enter "+name[i]+" Roll no = ");
               rollNo[i] = sc.nextInt();
           }
           for (int j = 0; j < 11; j++) {
               System.out.println("Students Name = " + name[j]);
               System.out.println("Roll No = " + rollNo[j]);
           }
       }catch (ArrayIndexOutOfBoundsException e)
       {
           System.out.println("Array Index out of bound");
       }
   }
}
