package com.s500076108.sorting;

import java.util.ArrayList;
import java.util.List;

public class Insertion {
    public static void sorting(int arr[],int n){
        for(int i=1;i<n;i++){
            int tempKey=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>tempKey){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=tempKey;
        }


    }
   
    public static void print(int arr1[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" : ");
        }
    }
    public static void main(String args[]){
        int array[]={8,7,9,2,6,3,4,5};
        int size=array.length;

        System.out.println("array before sorting-: ");
        print(array,size);
        sorting(array,size);
        System.out.println("array after sorting ");
        print(array,size);
    }
}
