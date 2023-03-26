import java.util.*;

public class BRange {
    public static void main(String args[]) {
        String A = "14795463132", B = "14795463139";
        long a=Long.parseLong(A);
        long b=Long.parseLong(B);
        int count =0;
        for(long i=a;i<=b;i++){
          int xor=  getXor(i);
          int minMax=getMinMax(i);
          if(xor>minMax){
              count++;
          }
        }
        System.out.println(count);
    }

    private static int getMinMax(long i) {
        List<Integer> stack = new ArrayList<>();
        while (i > 0) {
            stack.add((int) (i % 10));
            i = i /10;
        }
        int max=0,min=0;
            max=Collections.max(stack);
            min=Collections.min(stack);
            int avg=(max+min)/2;
            return avg;
    }


    private static int getXor(long a) {
        LinkedList<Integer> stack = new LinkedList<Integer>();
        while (a > 0) {
            stack.push((int) (a % 10));
            a = a /10;
        }
        int xor=0;
        while (!stack.isEmpty()) {
          xor=xor^(stack.pop());
        }
        return xor;
    }
}
