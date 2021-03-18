package com.r177219015.q3;

public class FootbalPlayer extends Player{
   public void football(String name,int age){
        System.out.println("i'm from football player class");
        System.out.println("Name = "+name+"  "+"Age = "+age);

    }
    public static void main(String args[]){
        FootbalPlayer fp= new FootbalPlayer();
        fp.football("messi",51);
        fp.display();
    }
}
