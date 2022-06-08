package com.akash.cp;

import jdk.dynalink.linker.LinkerServices;

import java.util.Scanner;

public class Q203 {
    public static class ListNode {
    int val;
      ListNode next;
      ListNode head;
  }
  public static void Insert(int x){
        ListNode l=new ListNode();
        l.val=x;
        l.next=null;
        if(l.head==null){
            l.head=l;
        }
        ListNode temp=l.head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=l;

  }
    public static void removeElements(ListNode head, int val) {
        ListNode itr=head;
        int temp=0;
        if(head==null){
            System.out.println("no element");
        }
        while(itr.next!=null && itr.val==val){
            itr=itr.next;
            head=itr;
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int no,value;
        System.out.print("how many element you want: ");
        no=sc.nextInt();
        for (int i=0;i<no;i++){
            value=sc.nextInt();
            Insert(value);
        }
    }
}
