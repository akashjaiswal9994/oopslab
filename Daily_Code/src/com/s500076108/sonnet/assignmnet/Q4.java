package com.s500076108.sonnet.assignmnet;


import java.util.LinkedList;

public class Q4 {

    public static void main(String[] args ){
        LinkedList<String> li=new LinkedList<>();
        String[] color={"Blue","Yellow","Green","white"};
       for(int i=0;i<color.length;i++){
           li.add(color[i]);
       }
        System.out.println("element in Linked List");
        System.out.println("First occurrence of element = "+ li.getFirst());
        System.out.println("Last occurrence of element = "+ li.getLast());
    }
}
