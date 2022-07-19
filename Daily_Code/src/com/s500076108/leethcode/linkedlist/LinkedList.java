package com.s500076108.leethcode.linkedlist;

public class LinkedList {
    int val;
    LinkedList next;
    LinkedList head;
    public void addData(int x){
        LinkedList node=new LinkedList();
        node.val=x;
        node.next=null;
        if(head==null){
            head=node;
        }
        else{
            LinkedList newHead=head;
            while(newHead.next!=null){
                newHead=newHead.next;
            }
            newHead.next=node;
        }
    }
    public void sort(){
        LinkedList node1=head,index=null;
        int temp;
        if(head==null){
            return;
        }

        else{
            while(node1!=null){
                index=node1.next;
//                while(index!=null){
//                    if(node1.val>)
//                }
            }
        }


    }
    public void print(){
        LinkedList node=head;
        while(node.next!=null){
            System.out.println(node.val);
            node=node.next;
        }
        System.out.println(node.val);
    }
    public static void main(String[] args){
        LinkedList list =new LinkedList();
        int[] arr={4,7,9,6,4,5};
        for(int i =0;i<arr.length;i++){
            list.addData(arr[i]);
        }
        System.out.println("element before sorting");
        list.print();
        list.sort();

    }
}
