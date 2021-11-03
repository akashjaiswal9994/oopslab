package com.s500076108.dsalgo;

import java.util.List;
import java.util.Scanner;

public class LinkedList {
    int data;
    LinkedList next;
    static LinkedList head;

    public static void Insert(int x){
      LinkedList node=new LinkedList();
      node.data=x;
      node.next=null;
      if (head==null){
          head=node;
      }
      else {
          LinkedList temp=head;
          while (temp.next!=null){
              temp=temp.next;
          }
          temp.next=node;
      }
    }


    public static void print(){
        LinkedList temp1=head;
        while (temp1.next!=null){
            System.out.println(temp1.data);
            temp1=temp1.next;
        }
        System.out.println(temp1.data);
    }

    public static void InsertFirstPosition(int y){
        LinkedList node=new LinkedList();
        node.data=y;
        node.next=null;
        node.next=head;
        head=node;
    }

    public static void InsertAtAnyPosition(int position, int value){
        LinkedList node=new LinkedList();
        node.data=value;
        node.next=null;
        if (position==0){
            InsertFirstPosition(value);
        }
        else {
            LinkedList n=head;
            for (int i=0;i<position-1;i++){
                n=n.next;
            }
            node.next=n.next;
            n.next=node;
        }

    }
    public  static void Delete(int pos){
        if (pos==0){
            head=head.next;
        }
        LinkedList temp=head;
        LinkedList n1=null;
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
        }
        n1=temp.next;
        temp.next=n1.next;
    }

    public static void main(String[] args){
        int count=1;
        Scanner sc=new Scanner(System.in);
        int no,value;
        System.out.print("how many element you want: ");
        no=sc.nextInt();
        for (int i=0;i<no;i++){
            value=sc.nextInt();
            Insert(value);
        }

        System.out.println("element before changes ");
         print();
         InsertFirstPosition(99);
        System.out.println("element after changes ");
         print();
         InsertAtAnyPosition(2,100);
        System.out.println("element after changes ");
         print();
         Delete(2);
        System.out.println("element after deleting ");
        print();

    }

}
