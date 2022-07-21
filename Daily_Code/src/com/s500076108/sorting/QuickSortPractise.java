package com.s500076108.sorting;

import java.util.Random;

public class QuickSortPractise {
    private static void printArray(int[] number) {
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
    }
    public static void main(String args[]){
        Random random =new Random();
        int[] number=new int[10];
        int size=number.length;
        for(int i=0;i<number.length;i++){
            number[i]=random.nextInt(100);
        }
        System.out.println("Before sorting:");
        printArray(number);
        quickSort(number,0,size-1);
        System.out.println("\nAfter sorting: ");
        printArray(number);

    }

    private static void quickSort(int[] number, int li, int hi) {
        if(li>=hi){
            return;
        }
        int pivot=number[hi];
        int leftIndex=li;
        int rightIndex=hi;
        while(leftIndex<rightIndex){
            while (number[leftIndex]<=pivot && leftIndex<rightIndex){
                leftIndex++;
            }
            while(number[rightIndex]>=pivot && leftIndex<rightIndex){
                rightIndex--;
            }
            swap(number,leftIndex,rightIndex);
        }
        swap(number,leftIndex,hi);
        quickSort(number,li,leftIndex-1);
        quickSort(number,leftIndex+1,hi);
    }

    private static void swap(int[] number, int leftIndex, int rightIndex) {
        int temp=number[leftIndex];
        number[leftIndex]=number[rightIndex];
        number[rightIndex]=temp;
    }


}
