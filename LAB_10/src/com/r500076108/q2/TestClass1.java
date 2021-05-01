package com.r500076108.q2;

public class TestClass1 {
    public static void main(String[] args){
        TreadingClass t1= new TreadingClass();
        Thread thread1= new Thread(t1);
        TreadingClass1 t2= new TreadingClass1();
        Thread thread2= new Thread(t2);
        thread1.start();
        thread2.start();

    }
}
