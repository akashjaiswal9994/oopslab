package com.r177219015.q4;

public class Class1 implements LabTest {
    public float value1,div;
    @Override
    public void division(float val) {
        value1=val;
        System.out.println("Division = "+value1);

    }

    @Override
    public void modules(float div1) {
        div= div1;
        System.out.println("Modules = "+div);
    }
    public static void main(String args[]){
        Class1 c1=new Class1();
        c1.division(45);
        c1.modules(24);

    }

}

