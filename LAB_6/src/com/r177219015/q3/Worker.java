package com.r177219015.q3;

public class Worker {
    private String name;
    private double salaryRate;
    private int hours;
    public Worker(String name ,double salaryRate)
    {
     this.name=name;
     this.salaryRate=salaryRate;
    }
    public void show(){
        System.out.println("Worker Name - "+this.name+" "+" Salary Rate - "+this.salaryRate);
    }
    public int comPay(int hours){
        return this.hours=hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalaryRate() {
        return salaryRate;
    }

    public void setSalaryRate(double salaryRate) {
        this.salaryRate = salaryRate;
    }

}
