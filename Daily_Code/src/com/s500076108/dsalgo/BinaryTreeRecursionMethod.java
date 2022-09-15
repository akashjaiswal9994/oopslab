package com.s500076108.dsalgo;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BinaryTreeRecursionMethod {
    static Scanner sc=null;
    public static void main(String args[]){
        sc=new Scanner(System.in);
        //List<Integer> list=new ArrayList<>();
         createTree();
    }
    public static Node createTree(){
        Node root=null;
        System.out.println("enter data: ");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        root=new Node(data);
        System.out.println("enter data for left side:"+data);
        root.left=createTree();
        System.out.println("enter data for right side"+data);
        root.right=createTree();
        return root;
    }
//    public static Node makeTree(Node root,int value){
//        if(root==null){
//            return new Node(value);
//        }
//        if(value<root.value)
//    }
}

class Node{
    Node left,right;
    int data;
    Node treeRoot;
    public Node(int data){
        this.data=data;

    }
}
