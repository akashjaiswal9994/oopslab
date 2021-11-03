package com.s500076108.sorting;

public class MergeSorting {
    public static void MergeSort(int[] ar,int[] ar1,int low,int high){
        if(low<high){

            int mid=low+(high-low)/2;
            MergeSort(ar,ar1,low,mid);
            MergeSort(ar,ar1,mid+1,high);
            sort(ar,ar1,low,mid,high);

        }
    }

    public static void sort(int[] array,int[] tempArray,int l,int mid,int h){
        for (int i=l;i<=h;i++){
            tempArray[i]=array[i];
        }
        int i=l,j=mid+1,k=l;
        while(i<=mid && j<=h){
            if(tempArray[i]<tempArray[j]){
                array[k++]=tempArray[i++];
            }
            else {
                array[k++]=tempArray[j++];

            }


        }
        while(i<=mid){
            array[k]=tempArray[i];
            k++;
            i++;
        }


    }


    public static void main(String args[]){
        int arr1[]=new int[]{7,4,32,14,9,77,45,20};
        int len1=arr1.length;

        MergeSort(arr1,new int[len1],0,len1-1);
        print(arr1,len1);
    }

    private static void print(int[] arr1, int len1) {
        for (int i=0;i<len1;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
