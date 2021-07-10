package com.s500076108.sorting;
import com.s500076108.sorting.Insertion;
public class MergeSortingIterative extends Insertion {
    public static void Merge(int[] ar1,int[] ar2,int[] ar3,int m1 ,int n1){
        int i=0,j=0,k=0;
        while(i<m1 && j<n1){
            if(ar1[i]<ar2[j]){
                ar3[k++]=ar1[i++];
            }
            else {
                ar3[k++]=ar2[j++];
            }
        }
        for(;i<m1;i++){
            ar3[k++]=ar1[i];

        }
        for (;j<n1;j++){
            ar3[k++]=ar2[j];
        }


    }
    public static void main(String args[]){

        int arr1[]={2,8,6,3,7,5};
        int arr2[]={10,1,4,9,11,19,14,16};
        int m= arr1.length,n=arr2.length;
        int arr3[]=new int[m+n];
        sorting(arr1,m);
        sorting(arr2,n);
       Merge(arr1,arr2,arr3,m,n);
       print(arr3,m+n);

    }
}
