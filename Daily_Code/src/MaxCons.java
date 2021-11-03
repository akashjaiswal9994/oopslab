import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxCons {
        public static int findMaxConsecutiveOnes(int[] nums) {
            int score=0;
            Integer count =0;
            int sCheck=0;
            int finalValue=0;
            for (int j=0;j<nums.length;j++){
                if(nums[j]==0){
                 sCheck++;
                 if(sCheck==nums.length)
                 {
                     return 0;
                 }
                }
            }
            List<Integer> list =new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                if(nums[i]==1) {
                    count++;
                    list.add(count);
                }
                else {

                    count=0;
                }


            }
            System.out.println(list);
            Integer max = Collections.max(list);
            finalValue=max.intValue();
            return finalValue;
        }
 public  static void main(String[] args){
            int[] ar={0,0};
            int result=findMaxConsecutiveOnes(ar);
            System.out.println(result);
 }
}
