import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tcs1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        List<Integer> list=new ArrayList<>();
        int s= sc.nextInt();
         int n=sc.nextInt();
         for(int i=1;i<=s;i++){
             if(i%10==n){
                list.add(i);
                count++;

             }
         }

         System.out.print(list);
        System.out.print(count);
    }
}
