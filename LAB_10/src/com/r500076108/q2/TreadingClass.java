package com.r500076108.q2;

public class TreadingClass implements Runnable {

    @Override
    public void run() {
        for(int i=1;i<50;i++)
        {
            if(i%2==0){
                System.out.println("Even No = "+i);
            }
        }

    }
}
class TreadingClass1 implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<50;i++)
        {
            if(i%2==1){
                System.out.println("ODD No = "+i);
            }
        }

    }
}
