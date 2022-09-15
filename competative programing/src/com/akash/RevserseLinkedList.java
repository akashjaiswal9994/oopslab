package com.akash;

import java.util.Scanner;
import java.util.Stack;


public class RevserseLinkedList {
    public static class Node{
            int data=0;
            Node next;
            static Node head;
        }
        private static void addData(int x) {
            Node node =new Node();
            node.data=x;
            node.next=null;
            if(Node.head==null){
                Node.head=node;
            }
            else {
                Node newHead = Node.head;
                while (newHead.next != null) {
                    newHead = newHead.next;
                }
                newHead.next=node;
            }
    }
    private static void print() {
        Node node = Node.head;
        while(node.next!=null){
            System.out.print(node.data+" ");
            node=node.next;

        }
        System.out.print(node.data+"\n");
    }

    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr=new int[n];
        for(int j=0;j<n;j++){
            arr[j]=sc.nextInt();
        }

        for(int i=0;i< arr.length;i++) {
            addData(arr[i]);
        }
       print();
       Reverse();

       print();
    }

    private static void Reverse() {
        Node newNode=Node.head;
        Stack<Integer> dp = new Stack<Integer>();
        while(newNode.next!=null){
            dp.push(newNode.data);
            newNode=newNode.next;
        }
        dp.push(newNode.data);
        Node.head=null;
        while (!dp.empty()){

            addData(dp.pop());
        }
    }



}
