package com.akash.cp;

public class Q167 {

    public static int[] twoSum(int[] numbers, int target) {
        int start=0, end=numbers.length-1;
        int[] result=new int[2];

        while(start<end){
            int sum=numbers[start]+numbers[end];
            if(sum==target){
                result[0]=start+1;
                result[1]=end+1;
                break;
            }
            else if(sum<target){
                start++;
            }
            else {
                end--;
            }
        }
        return result;
    }

    public static void main(String[] args){
           int[] arr={2,7,11,15};
        System.out.println(twoSum(arr,9));
    }
}
