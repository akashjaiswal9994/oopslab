package com.s500076108.queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class ArrayQueue1 {
    private int[] items;
    private int rear;
    private int count=0;
    private int front;
    public ArrayQueue1(int size){
        items=new int[size];
    }
    public void enQueue(int item){
        if(count==items.length){
            throw new IllegalStateException();
        }
        items[rear]=item;
        rear=(rear+1)%items.length;
        count++;
    }
    public int deQueue(int take){
        this.front=take;
        if(take>items.length){
            throw new IllegalStateException();
        }
        var item=items[front];
        items[front]=0;
        front=(front+1)%items.length;
        count--;
        return item;
    }
    @Override
    public  String toString(){
        return Arrays.toString(items);
    }
}
