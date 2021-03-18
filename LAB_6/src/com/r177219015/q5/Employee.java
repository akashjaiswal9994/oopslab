package com.r177219015.q5;

public class Employee {
    private String name;
    private  long empid;
    private double salary = 0;
    public Employee(){
        System.out.println("This is a default constructor");
    }
    public Employee(String name,long empid,double salary){
        this.name=name;
        this.empid=empid;
        this.salary=salary;
    }
    void display(){
        System.out.println("Employee Name = "+this.name);
        System.out.println("Employee ID = "+this.empid);
        System.out.println("Employee Salary = "+this.salary);
    }
    public void  increaseSalary(float per){
        salary+=salary*(per/100);
        System.out.println("Salary after increment = "+salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getEmpid() {
        return empid;
    }

    public void setEmpid(long empid) {
        this.empid = empid;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
