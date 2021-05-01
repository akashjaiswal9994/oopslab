package com.r500076108.q3;

public class SynClass  {
    int count=0;
    public synchronized   void Counter(){
        count++;
        System.out.println(count);
    }
}
