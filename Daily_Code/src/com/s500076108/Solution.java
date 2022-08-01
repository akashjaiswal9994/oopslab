package com.s500076108;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int candy(ArrayList<Integer> A) {

        ArrayList<Integer> left = new ArrayList<>(A);
        ArrayList<Integer> right = new ArrayList<>(A);
        for(int i=1;i< A.size();i++){
            if(A.get(i)>A.get(i-1)){
                left.set(i,left.get(i-1)+1);
            }
        }
        for(int i=0;i< A.size()-1;i++){
            if(A.get(i)>A.get(i+1)){
                right.set(i,left.get(i+1)+1);
            }
        }
        int sum=0;
        for(int j=0;j<A.size();j++){
            sum+=Math.max(left.get(j), right.get(j));
        }
        return sum;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(1);
        System.out.println(candy(list));

    }

}
