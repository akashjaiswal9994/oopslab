package com.s500076108;

import java.util.Arrays;
import java.util.Scanner;

public class Students{
    public static void getMarks( int[] marks){
        Arrays.sort(marks);
        for(int i=0;i<marks.length; i++){
            if(marks[i]>100){
                System.out.println("Invalid Marks");
            }
            else if(marks[i]>=40 && marks[i]<=50){
                System.out.println(marks[i]+ "  Pass");
            }
            else if(marks[i]>=51 && marks[i]<=75){
                System.out.println(marks[i]+ "  Merit");
            }
            else if(marks[i]>75){
                System.out.println(marks[i]+ "  DISTINCTION");
            }
            else if(marks[i]<40){
                System.out.println(marks[i]+ "  Fail");
            }
        }
        
    }
     static void hello(){
        System.out.println("hello moon hehehe");
    }

    public static void main(String[] args){
//      Scanner sc = new Scanner(System.in);
//      int [] marks=new int[10];
//      for(int i=0;i<10;i++) {
//          System.out.print("Enter Marks Of Student "+ (i+1)+ ": ");
//          marks[i]= sc.nextInt();
//        }

        //getMarks(marks);

        hello();

    }
}
