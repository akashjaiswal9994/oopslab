package com.akash.cp;

import java.util.ArrayList;
import java.util.List;

public class Q287 {
    public static int findDuplicate(int[] nums) {
        List<Integer>list = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++) {
            if (list.contains(nums[i])){
                return nums[i];
            }
           list.add(nums[i]);

        }
     return -1;
    }
    public static void main(String[] args){
        int [] arr=new int[]{3,1,3,4,2};
        System.out.println(findDuplicate(arr));
    }
}
