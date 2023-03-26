package com.s500076108.sonnet.assignmnet;

import java.util.*;


public class Q3 {

    public static void main(String[] args){
      String[] color={"Blue","Yellow","Green","white"};
        System.out.println(  arrayList(color));
     }

    private static ArrayList arrayList(String[] color) {
        ArrayList<String> col=new ArrayList<>();
         for(int i=0;i< color.length;i++){
             col.add(color[i]);
         }

            return col;
    }

}
