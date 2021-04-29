package com.r500076108.q1;

public class TestClass {
    public static void main(String[] args){
    ThreadSample t1= new ThreadSample();
    ThreadSample t2=new ThreadSample();
    ThreadSample t3=new ThreadSample();
t3.setPriority(Thread.MAX_PRIORITY);

    t1.start();
    t2.start();
    t3.start();

RunnableSample r1=new RunnableSample();
Thread tt1=new Thread(r1);
RunnableSample2 r2=new RunnableSample2();
        Thread tt2=new Thread(r2);
    tt1.start();
    tt2.start();
    }
}
