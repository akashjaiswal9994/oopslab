package com.akash.cp;

public class Q169 {
    public static int majorityElement(int[] nums) {
        int count=0 ,cand=nums[0];
        int size= nums.length/2;
        for(int i=0;i<nums.length;i++){
            if(cand==nums[i]){
                count++;
            }
            else
                count--;
            if(count==0) {
                cand = nums[i];
                count=1;
            }

        }
//        for(int i=0;i<nums.length;i++)
       return cand;
    }
    public static void main(String[] args){
        int[] arr={3,2,3};
        System.out.println(majorityElement(arr));
    }
}
