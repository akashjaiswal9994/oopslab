package com.s500076108.dsalgo;

import java.util.Scanner;

public class SortALinkedList {
    int data;
    SortALinkedList next;
    static SortALinkedList head;

    public static void Insert(int x){
        SortALinkedList node= new SortALinkedList();
        node.data=x;
        node.next=null;
        if(head==null){
            head=node;

        }
        else {
            SortALinkedList current=head;
            while (current.next!=null){
                current=current.next;
            }
            current.next=node;
        }
    }

    public static void print(){
        SortALinkedList current=head;
        while (current.next!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.print(current.data);
    }
    public static void Sorting(){
        SortALinkedList start=head,index = null;
        int temp;
        if(head==null)
        {
            return;
        }
        else
        {
            while (start!=null){
                index=start.next;
                while (index!=null){
                    if(start.data> index.data){
                        temp=start.data;
                        start.data= index.data;
                        index.data=temp;
                    }
                    index=index.next;
                }
                start=start.next;
            }
        }

    }
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int i,take,value;
    System.out.println("how many element you want to Insert ");
    take= sc.nextInt();

    for (i=1;i<=take;i++){
        System.out.print("enter "+i+" element: ");
        value=sc.nextInt();
        Insert(value);
    }
    print();
    Sorting();
    System.out.println("\nafter sorting the list");
    print();

}
}
