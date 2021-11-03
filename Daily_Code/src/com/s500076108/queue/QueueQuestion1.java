package com.s500076108.queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class QueueQuestion1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Queue<Integer> queue=new ArrayDeque<>();
        queue.add(9);
        queue.add(8);
        queue.add(4);
        queue.add(5);
        queue.add(2);
        queue.add(3);
        System.out.println("enter the range: ");
        int range=sc.nextInt();
        if(range>queue.size()){
            throw  new IllegalStateException();
        }

        System.out.println(queue);
        reverse(queue,range);

//       var removed= queue.remove();
//        System.out.println("removed item: "+removed);
         System.out.println(queue);
    }

    public static void reverse(Queue<Integer> queue1,int range){

        Stack<Integer>stack=new Stack<>();

       for(int i=0;i<range;i++){
              stack.push(queue1.remove());

        }

        while (!stack.isEmpty()){
            queue1.add(stack.pop());
        }
        for(int j=0;j<queue1.size()-range;j++){
            queue1.add(queue1.remove());
        }

    }

}
