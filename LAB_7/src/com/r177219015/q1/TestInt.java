package com.r177219015.q1;

import java.util.Scanner;

//import com.r177219015.q1.Arithmethic;
public class TestInt extends Arithmethic{
    public static void main(String args[]){
//        Arithmethic obj =new Arithmethic();
//        obj.square();
        TestInt obj1= new TestInt();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number = ");
        int y = sc.nextInt();
        obj1.square(y);
  }
}
