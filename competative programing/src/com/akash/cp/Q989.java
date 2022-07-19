package com.akash.cp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q989 {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        int l1=num.length;
        long res=0;
        for(int i=0;i<l1;i++){
            res=num[i]+res*10;
        }
        res=res+k;
        List<Integer> list=new ArrayList() ;

        while(res>0){
            list.add((int) (res%10));
            res=res/10;
        }


        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args){
        int[] arr={1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int no=516;
        List<Integer> li= addToArrayForm(arr,no);
        System.out.println(li);

    }
}
