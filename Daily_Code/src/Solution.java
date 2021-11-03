import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges){
        System.out.println("");
        int countApples=0;
        int countOrange=0;
        int app,org;
        for (int i=0;i<apples.size();i++){
            app=a+apples.get(i);
            if(app>=s && app<=t){
                countApples++;
            }

        }
        for (int i=0;i<oranges.size();i++){
            org=b+oranges.get(i);
            if(org>=s && org<=t){
                countOrange++;
            }

        }
        System.out.println(countApples);
        System.out.println(countOrange);


    }

    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         int s,t,a,b;
        List<Integer> apples=new ArrayList<>();
        List<Integer> orange=new ArrayList<>();
        System.out.print("Enter staring position of house: ");
        s=sc.nextInt();
        System.out.print("Enter end position of house: ");
        t= sc.nextInt();

        System.out.print("Enter  position of apple tree: ");
        a= sc.nextInt();
        System.out.print("Enter  position of orange tree: ");
        b= sc.nextInt();

        for(int i=1;i<=3;i++ ){
            System.out.print("enter "+i+" position: ");
            int w=sc.nextInt();
            apples.add(w);
        }
        System.out.print("Apples position = "+apples);
        for(int i=1;i<=3;i++ ){
            System.out.println("");
            System.out.print("enter "+i+" position: ");
            int w=sc.nextInt();
            orange.add(w);
        }
        System.out.print("Orange position = "+apples);
        countApplesAndOranges(s,t,a,b,apples,orange);

    }

}
