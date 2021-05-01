package com.r500076108.q4;

public class PriorityCheck extends Thread {
    public PriorityCheck(String s) {
        super(s);
    }
    @Override
    public void run(){

            System.out.println("hello akash is here from "+this.getName());

    }

}
