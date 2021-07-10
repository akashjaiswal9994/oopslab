package com.s500076108.sorting;

public class BubbleSort {

    public static void main(String args[]){
        int array[]={7,25,59,9,4,5,6,3,2,1};
        for(int i =0;i<array.length;i++){
            for (int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp =array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for (int k=0;k<array.length;k++){
            System.out.print(array[k]+" : ");
        }
    }
}
