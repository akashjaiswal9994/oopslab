package com.s500076108.dsalgo;

import java.util.Scanner;

public class SearchInLinkedList {
    SearchInLinkedList next;
    static SearchInLinkedList head;
    int data;
    public static void main(String[] rags){
        Scanner sc= new Scanner(System.in);
        int no,value,ele;
        System.out.print("Enter the number  of Element:  ");
        no=sc.nextInt();
        for(int i=0;i<no;i++){
            System.out.print("Element "+i+" : ");
            value=sc.nextInt();
            InsertValue(value);
        }
        print();
        System.out.println("\nEnter the element to be search:  ");
        ele= sc.nextInt();
       boolean result=  search(ele);
        System.out.println(result);
    }

    private static void InsertValue(int x) {
        SearchInLinkedList node=new SearchInLinkedList();
        node.data=x;
        node.next=null;
        if(head==null){
            head=node;
        }
        else{
            SearchInLinkedList start=head;
            while (start.next!=null){
                start=start.next;
            }
            start.next=node;
        }
    }
    private static void print(){
        SearchInLinkedList start=head;
        while (start.next!=null){
            System.out.print(" "+start.data);
            start=start.next;
        }
        System.out.print(" "+start.data);
    }

    private  static boolean search(int x){
        SearchInLinkedList begin=head;
        while (begin.next!=null){
            if(begin.data==x){
                return true;
            }
            else {
                begin=begin.next;
            }
        }


        return false;
    }

}
