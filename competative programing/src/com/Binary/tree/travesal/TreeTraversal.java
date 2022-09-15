package com.Binary.tree.travesal;

public class TreeTraversal {
     int data;
     TreeTraversal left,right;
     static TreeTraversal root;

    public static void main(String args[]) {
        int[] arr = {4, 7, 8, 9, 5, 6, 3, 2, 1};
        for (var a : arr) {
            insert(a);
        }
    }

    private static void insert(int a) {
        TreeTraversal node =new TreeTraversal();
        node.data=a;
        if(root == null){
            root=node;
        }
        var current = root;
        while (true){
         if(a< current.data){
            if(current.left==null){
                current.left=node;
                break;
            }
            current=current.left;

         }
         else {
             if(current.right==null){
                 current.right=node;
                 break;
             }
             current=current.right;
         }
        }

    }
}

