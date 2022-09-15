package com.s500076108;

public class BTRecursion {


    public static Node createTree(){
        Node root=null;
        int data=getData();
        if(data==-1){
        return null;
    }
    root=new Node(data);
    data=getData();
    root.left=createTree();
    data=getData();
    root.right=createTree();

    return root;
    }

    private static int getData() {
        int[] arr={9,2,-1,4,-1,-1,1,8,7};
        for(int i=0;i<arr.length;i++)
            return arr[i];
        return 0;
    }

    public static void main(String[] args){

      createTree();
    }
}
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;

    }
}
