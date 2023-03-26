package com.s500076108;

public class ContinuousSubarraySum {
    public static void main(String[] args){
        int [] arr={-1,2,1,4};
        int k=1;
        System.out.println(checkSubarraySum(arr,k));
    }
    public static boolean checkSubarraySum(int[] nums, int k) {

        int minLength=0;
        int start=0;
        int end=0;
        int curSum=0;
        boolean flag=false;
        while(end<nums.length){
            curSum+=nums[end];
            end++;

            while(start<end && curSum+1==k || curSum-1==k){

                curSum=curSum-nums[start];
                start++;

               // minLength=Math.max(minLength,end-start+1);

            }


        }
        if(minLength>=2){
            flag =true;
        }
        else
            flag=false;
        return flag;
    }
}
