package com.r500076108.q1;

public class RunnableSample implements Runnable {
    @Override
    public void run() {
        int i=0;
        while(i<10) {
            System.out.println("im a thread from runnable 1 ");
        i++;
        }
    }
}
class RunnableSample2 implements Runnable{

    @Override
    public void run() {
        int i=0;
        while(i<5) {
            System.out.println("im a thread from runnable 2 ");
            i++;
        }
    }
}
