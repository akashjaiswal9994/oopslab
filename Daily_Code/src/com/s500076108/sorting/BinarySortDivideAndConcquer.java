package com.s500076108.sorting;

import java.util.Scanner;

public class BinarySortDivideAndConcquer {
    private static void sorting(int[] array, int length) {
        for(int i=1;i<length;i++){
            int key=array[i];
            int j=i-1;
            while(j>=0 && array[j]>key ){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
        }
    }
    private static int binarySearch(int[] array, int l, int length, int value) {
        int mid;
        if(l==length){
            if(array[l]==value){
                return l;
            }
            else
                return -1;
        }
        else {
            mid=(l+length)/2;
            if(array[mid]==value)
                return mid;
             if(array[mid]>value){
                 return binarySearch(array, l, mid-1, value);
             }
             else
                 return binarySearch(array, mid+1, length, value);
        }
    }
    public  static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int array[]=new int[10];
        for(int pp=0;pp<10;pp++){
            System.out.print("enter the "+pp+" element :");
            array[pp]= sc.nextInt();
        }
        int length=array.length,l=0;
        sorting(array,length);
        for (int k=0;k<array.length;k++){
            System.out.print(array[k]+" : ");
        }

        System.out.print("\nEnter the element you want to search: ");
        int value=sc.nextInt();
        int result=binarySearch(array,l,length,value);
        if(result==-1){
            System.out.println("element not found!");
        }
        else
        {
            System.out.println("element found at index : "+(result+1));
        }

    }


}
