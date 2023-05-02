package com.sonnet;

import java.util.Scanner;

public class UserData {
    public Long userId;
    public String uname;
    public Float amount=0f,withdraw=0f,deposit=0f;
    Scanner sc=new Scanner(System.in);
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {

        this.userId = userId;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Float getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(Float withdraw) {
        this.withdraw = withdraw;
    }

    public Float getDeposit() {
        return deposit;
    }

    public void setDeposit(Float deposit) {
        this.deposit = deposit;
    }

    public  void getData(){
        System.out.print("Enter Sap ID: ");
        userId =sc.nextLong();
        System.out.print("Enter Your Name: ");
        uname=sc.next();
        System.out.print("Enter The Amount to be Deposit: ");
        deposit=sc.nextFloat();
    }

}
