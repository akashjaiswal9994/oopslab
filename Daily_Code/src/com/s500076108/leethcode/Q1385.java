package com.s500076108.leethcode;


import java.util.Arrays;

public class Q1385 {
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int l=0,r=arr2.length;
        while(l<=r){
            int mid=l+r/2;
            if(Math.abs(arr1[0]-arr2[mid])<=d){

            }
        }
    }

    public static void main(String args[]){
        int[] arr1={4,5,8};
        int[] arr2={10,9,1,8};
        int d=2;
        findTheDistanceValue(arr1,arr2,d);

    }
}
