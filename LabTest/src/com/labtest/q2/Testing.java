package com.labtest.q2;

public class Testing  {
    public static void main(String args[]) throws CloneNotSupportedException {
        Employee e1=new Employee(12,"Rohan","HR");
        e1.show();
        System.out.println(" ");
        e1.setName("RAM");
        Employee e2= (Employee) e1.clone();
        e2.show();
    }
}
