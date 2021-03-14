package com.r177219015.q3;

public class HockeyPlayer extends Player {
    public void hockey(String name,int age){
        System.out.println("i'm from Hockey player class");
        System.out.println("Name = "+name+"  "+"Age = "+age);
    }

    public static void main(String args[]){
        HockeyPlayer hp= new HockeyPlayer();
        hp.hockey("Dhyan chand",78);
        hp.display();
    }
}
