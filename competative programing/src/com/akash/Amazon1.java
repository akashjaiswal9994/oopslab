package com.akash;

import javax.crypto.spec.PSource;
import java.util.Scanner;
 public class Amazon1 {
    public  void cal(int distance, int time){
        int speed =distance/time;
        System.out.println(speed);
        System.out.println("method form the base class");
    }
    public static void main(String args[]){

    }
}
class Amazon2 extends Amazon1 {
    public  void cal(int distance, int time){
        int speed =distance/time;
        System.out.println(speed*2);
        System.out.println("Method from the derived class");
        super.cal(45,6);
    }
   public static void main(String args[]){
        Amazon2 a = new Amazon2();
        a.cal(45,8);
   }
}

