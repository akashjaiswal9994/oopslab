package com.akash.cp;

import java.util.Arrays;

public class Q1011 {
    public static void main(String args[]){
        int[] arr={12,36,45,90};
        int days=2;
        System.out.println(shipWithinDays(arr,days));
    }

    private static int shipWithinDays(int[] arr, int days) {
        int high=0;
        for(int i=0;i<arr.length; i++){
        high+=arr[i];
        }
        int low=arr[0];
        int allot=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(ifPossible(arr,mid,days)){
                allot=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }

        }
        return allot;
    }

    private static boolean ifPossible(int[] arr, int mid, int days) {
        int capacity=0;
        int count=1;
        for(int i=0;i<arr.length;i++){

            if(arr[i]>mid){

                return false;
            }
            if(capacity+arr[i]>mid){
                count+=1;
                capacity=0;
                capacity+=arr[i];
            }
            else{
                capacity+=arr[i];

            }
        }
        if (count>days){
            return false;
        }
        return true;
    }


}
