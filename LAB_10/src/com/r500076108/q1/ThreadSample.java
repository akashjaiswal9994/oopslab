package com.r500076108.q1;

public class ThreadSample extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++) {

            try {
                sleep(800);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("thread is running ");
   }

}
