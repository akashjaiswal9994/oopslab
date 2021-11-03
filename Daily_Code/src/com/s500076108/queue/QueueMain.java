package com.s500076108.queue;

import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args){
        ArrayQueue1 queue1=new ArrayQueue1(5);
        Scanner sc=new Scanner(System.in);
        queue1.enQueue(10);
        queue1.enQueue(20);
        queue1.enQueue(40);
        queue1.enQueue(80);
        System.out.println(queue1);
        System.out.print("Enter the item position you want to remove: ");
        int pos= sc.nextInt();
        var re=queue1.deQueue(pos-1);
        System.out.println(re);
        System.out.println(queue1);

        System.out.print("Enter the item position you want to remove: ");
         pos= sc.nextInt();
         re=queue1.deQueue(pos-1);
        System.out.println(re);
        System.out.println(queue1);
        queue1.enQueue(90);
        System.out.println(queue1);
        queue1.enQueue(100);
        System.out.println(queue1);
    }
}
