package com.akash;

import java.util.Stack;

public class Stackkk {
    static class Node {
        int data = 0;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
    public static Node head;
    public static void push(int data){
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public static int pop(){
        int top=head.data;
        head=head.next;
        return top;
    }
    public static void print(){
        Node temp=head;
        while(temp.next!=null){
            System.out.println(temp.next);
            temp=temp.next;
        }
        System.out.println(temp.next);
    }
        public static void main(String[] args){
        int[] arr={12,56,98,23,22};
        for(int i=0; i<arr.length;i++){
            push(arr[i]);
        }
        print();
        }
        Stack<Integer> stack = new Stack<>();

    }

