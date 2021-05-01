package com.r500076108.q4;

public class TestClass3 {
    public static void main(String[] args){
        PriorityCheck pc1=new PriorityCheck("thread 1");
        PriorityCheck pc2=new PriorityCheck("thread 2");
        PriorityCheck pc3=new PriorityCheck("thread 3" );
        PriorityCheck pc4=new PriorityCheck("thread 4");
        PriorityCheck pc5=new PriorityCheck("thread 5");
        pc2.setPriority(Thread.MAX_PRIORITY);
        pc3.setPriority(Thread.MIN_PRIORITY);
        pc1.setPriority(Thread.NORM_PRIORITY);
        pc5.setPriority(Thread.MAX_PRIORITY);
        pc4.setPriority(Thread.MIN_PRIORITY);

        pc1.start();
        pc2.start();
        pc3.start();
        pc4.start();
        pc5.start();

    }
}
