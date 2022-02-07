package com.akash.cp;

public class Q80Leathcode {
    public static int removeDuplicates(int[] nums) {

        int prev = nums[0], count = 1, pos = 1;
        for (int i = 1; i < nums.length; i++){
            if (prev != nums[i])
            {  count = 1;
                prev = nums[i];
                nums[pos++] = nums[i];
            }

            else if (count++ < 2)
                nums[pos++] = nums[i];
        }
        return pos;

    }
    public static void main(String[] args){

      int[] arr={0,0,1,1,1,1,2,2,3,3};
        System.out.println(removeDuplicates(arr));
    }
}
