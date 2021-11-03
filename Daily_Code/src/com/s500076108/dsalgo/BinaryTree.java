package com.s500076108.dsalgo;

import java.util.Scanner;

public class BinaryTree {
    int value;
    BinaryTree leftChild;
    BinaryTree rightChild;
    static BinaryTree root;
    @Override
    public String toString(){
        return "value= "+value;
    }
    public static void insert(int x) {
        BinaryTree node = new BinaryTree();
        node.value = x;
        if (root == null) {
            root = node;
        }
        var current = root;
        while (true) {
            if (x < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current=current.leftChild;
            }
            else {
                if(current.rightChild==null){
                    current.rightChild=node;
                    break;
                }
                current=current.rightChild;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        insert(9);
        insert(7);
        insert(15);
        insert(2);
        insert(3);

    }
}
