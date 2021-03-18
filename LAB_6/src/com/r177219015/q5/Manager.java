package com.r177219015.q5;

import java.util.Scanner;

public class Manager extends Employee{
    public String department;

    public Manager(String name, long empid, double salary) {
        super(name, empid, salary);
    }
    public void dis(String dep,float pe) {
        department=dep;
        System.out.println("Department = "+department);
        display();
        increaseSalary(pe);
    }

    public static void main(String args[]){
        Employee e=new Employee();
        Scanner sc= new Scanner(System.in);
       // Manager m=new Manager();
        Manager m1=new Manager("Ram",50007648,4812.21);

        System.out.print("Increment percentage = ");
        float per= sc.nextFloat();
        m1.dis("CSE",per);

    }
}
