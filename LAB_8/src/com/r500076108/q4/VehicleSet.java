package com.r500076108.q4;

import java.util.Scanner;

public class VehicleSet extends Exception{
    public VehicleSet(String D1,String D2){
        super(D2);
        if(D1.equals(D2)){
          System.out.println("Collision Not Happens");

        }
        else
        {
            System.out.println("Vehicle collision Happens");
        }

    }

}
class CheckIt{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter first direction = ");
        String d1=sc.next().trim();
        System.out.print("enter second direction = ");
        String d2= sc.next().trim();
    try{
        throw new VehicleSet(d1,d2);

    }catch (VehicleSet vs){
        System.out.println(vs.getMessage());
    }
    }
}