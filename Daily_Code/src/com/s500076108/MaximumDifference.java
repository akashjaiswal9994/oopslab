package com.s500076108;

import java.util.*;

public class MaximumDifference {
    public  static  void main(String[] args){
        int[] arr={1};
                List<Integer> list=new ArrayList<>();
        for(int i=arr.length-1;i>=1;i--){
           for(int j=0;j<arr.length;j++){
               if(i>j){
                   list.add(arr[i]-arr[j]);
               }
           }
        }

        System.out.println(list);
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            int x = (Integer)itr.next();
            if (x < 0)
                itr.remove();
        }
        System.out.println("new - "+list);
        if(list.isEmpty()){
            System.out.println(0);
        }
        else {
            int max = Collections.max(list);
            if (max > 0)
                System.out.println(max);
            else
                System.out.println(-1);
        }

    }

}
