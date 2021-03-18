package com.r177219015.q3;

public class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }
    public int days;
    public int days(int days){
        return this.days=days;
    }

    public static void main(String args[]){
     DailyWorker dw= new DailyWorker("rohan",480.2);

     int x=dw.days(4);
     x=x*24;
     int z= dw.comPay(x);
     dw.show();
     System.out.println("week pay = "+z*dw.getSalaryRate());

    }


}
