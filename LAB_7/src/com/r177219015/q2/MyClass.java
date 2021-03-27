package com.r177219015.q2;

public class MyClass implements A {
    @Override
    public void meth1() {
        System.out.println("meth1 created in MyClass");
    }

    @Override
    public void meth2() {
        System.out.println("meth2 Created in MyClass");

    }
    public static void main(String args[]){
        MyClass obj1= new MyClass();
        obj1.meth1();
        obj1.meth2();
    }

}
