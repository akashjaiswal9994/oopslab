package com.r177219015.q4;

import java.util.Scanner;

public class CalCharge extends Telephone{



    public static void main(String args[]){
        CalCharge cc= new CalCharge();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter type of call (in lower case) ");
        System.out.println("ordinary, urgent or lightning");
        String tc=sc.next();
        System.out.print("Enter Call Duration - ");
        float dur=sc.nextFloat();
        cc.calDetail(tc,dur);


    }
}
