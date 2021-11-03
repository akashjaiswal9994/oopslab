package com.s500076108.dsalgo;


import java.util.Scanner;



public class ReverseLinkedList {
    int data;
    ReverseLinkedList next;
    static ReverseLinkedList head;
    public static void InsertValue(int x){
        ReverseLinkedList node= new ReverseLinkedList();
        node.data=x;
        node.next=null;
        if(head==null){
            head=node;
        }
        else {
            ReverseLinkedList current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=node;
        }


    }
    // TODO: understand the logic
    public static void Reverse(){
        ReverseLinkedList start=head;
        ReverseLinkedList prev=null,temp=null;
        while (start!=null){
            temp=start.next;
            start.next=prev;
            prev=start;
            start=temp;
        }
            head=prev;

    }
    public static void print(){
        ReverseLinkedList  start=head;
        while (start.next!=null){
            System.out.print(" "+start.data);
            start=start.next;
        }
        System.out.print(" "+start.data);
    }
    public static void main(String[] args){
        LinkedList ls=new LinkedList();
        Scanner sc=new Scanner(System.in);
        int no,value;
        System.out.print("No of Element : ");
        no=sc.nextInt();
        for (int i =0;i<no;i++){
            System.out.print("Element "+i+" : ");
            value= sc.nextInt();
           InsertValue(value);

        }
        print();
        Reverse();
        System.out.println();
        print();


    }
}
