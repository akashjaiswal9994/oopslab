package com.s500076108.q3;

public class SingletonDesignPattern {
    public static SingletonDesignPattern obj;
    private SingletonDesignPattern()
    {

        System.out.println("printer is created...."+this);
    }
    public static SingletonDesignPattern getAccess(){
        if(obj==null) {
            obj = new SingletonDesignPattern();
        }
        return obj;
    }
}
