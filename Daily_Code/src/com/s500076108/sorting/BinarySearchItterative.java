package com.s500076108.sorting;

import java.util.Scanner;

public class BinarySearchItterative {
    public static void sorting(int ar[],int n){
        for(int i=1;i<n;i++){
            int temp=ar[i];
            int j=i-1;
            while(j>=0&& ar[j]>temp){
                ar[j+1]=ar[j];
                j--;
            }
            ar[j+1]=temp;
        }
    }
    public  static int BinarySearch(int arg[],int n,int se){
     int l=0,r=n,mid;
     while (l<=r) {
         mid = (l + r) / 2;
         if (arg[mid] == se) {
             return  mid+1;
         }
         if(arg[mid]<se){
             l=mid+1;
         }
         else {

              r=mid-1;
         }
     }
     return -1;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int array[]={7,9,5,3,4,6,22,14,99,45,23,1,2};
        int length=array.length;
        sorting(array,length);
        for (int k=0;k<array.length;k++){
            System.out.print(array[k]+" : ");
        }
        System.out.println("");
        System.out.print("Enter the number you want to search : ");
        int value=sc.nextInt();
        int result=BinarySearch(array,length,value);
        if(result==-1){
            System.out.println("element not found!");
        }
        else {
            System.out.println("element found at position  "+result);
        }
    }
}
