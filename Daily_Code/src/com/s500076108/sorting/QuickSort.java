package com.s500076108.sorting;

import java.util.Scanner;


public class QuickSort {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("how many element you want: ");
        int element= sc.nextInt();
        int arr[]=new int[element];
        for (int i= 0;i<element;i++){
            System.out.print("element "+i+" : ");
            arr[i]= sc.nextInt();
        }
        int l=0,h=element;
        quick(arr,l,h);
        for(int ll=0;ll<element;ll++) {
            System.out.println(arr[ll]);
        }
    }

    private static void quick(int[] arr, int l, int h) {
        if(l<h){
            int j= partition(arr,l,h);
            quick(arr,l,j-1);
            quick(arr,j+1,h);
        }
    }

    private static int partition(int[] arr, int l, int h) {
        int pivot=arr[l];
        int i=l-1,j=h;
        while (i<j){
            do {
                i++;
            }while (arr[i]<pivot);
            do {
                j--;
            }while (arr[j]>pivot);
            if(i<j) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        int temp1=arr[l];
        arr[l]=arr[j];
        arr[j]=temp1;
        return  j;
    }


}
