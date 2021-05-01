package com.r500076108.q3;

public class TestClass2 {
    public static void main(String[] args) throws InterruptedException {
        SynClass s1=new SynClass();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++)
             s1.Counter();

            }
        });
        
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++)
             s1.Counter();

            }
        });
        
        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++)
             s1.Counter();

            }
        });

        Thread t4=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++)
             s1.Counter();

            }
        });
       
        Thread t5=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++)
             s1.Counter();

            }
        });
        
        Thread t6=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++)
             s1.Counter();

            }
        });
        
        Thread t7=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++)
             s1.Counter();

            }
        });
        
        Thread t8=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++)
             s1.Counter();

            }
        });
        
        Thread t9=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++)
                s1.Counter();

            }
        });
        Thread t10=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++)
                s1.Counter();
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        t7.join();
        t8.join();
        t9.join();
        t10.join();
    }
}
