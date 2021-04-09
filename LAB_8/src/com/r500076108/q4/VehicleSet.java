package com.r500076108.q4;

import java.util.Scanner;

public class VehicleSet extends Exception{
    public VehicleSet(String D1,String D2){
       super("done");
        if(D1.equals(D2)){
            System.out.println("both ths Vehicle Going in "+D1+" direction");
          System.out.println("So Collision will Not Happen");

        }
        else
        {
            System.out.println("Vehicle A going from "+D1+ " to "+D2+" Direction ");
            System.out.println("Vehicle B going from "+D2+ " to "+D1+" Direction ");
            System.out.println("so Vehicle collision will  Happen");
        }

    }

}
class CheckIt{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Vehicle A direction = ");
        String d1=sc.next().trim();
        System.out.print("Enter Vehicle B direction = ");
        String d2= sc.next().trim();
    try{
        throw new VehicleSet(d1,d2);

    }catch (VehicleSet vs){
        System.out.println(vs.getMessage());
    }
    }
}