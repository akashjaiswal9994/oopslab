package com.r177219015.q2;

public class CricketPlayer extends Player {
    public void cricketPlayer(String name,int age)
    {
        System.out.println("Name = "+name+"  "+"Age = "+age);
    }
    public static void main(String args[]){
        CricketPlayer cp= new CricketPlayer();
        System.out.println("I'm from CriketPlayer class");
        cp.cricketPlayer("Dhoni",50);
        cp.display();
    }
}
