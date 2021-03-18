package com.r177219015.q3;

public class SalariedWorker extends Worker{

    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }
    public static void main(String args[]){
        SalariedWorker sw =new SalariedWorker("Ravi",9000);
        int zz = sw.comPay(40);
        sw.show();
        System.out.println("week pay = "+zz*sw.getSalaryRate());
    }
}
