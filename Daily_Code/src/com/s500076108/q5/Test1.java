package com.s500076108.q5;

import java.util.*;

public class Test1 {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        List<Integer> li=new ArrayList<>();
            List<Integer> ll=new ArrayList<>();

        int sum=0,sum1=0;

        li.add(2);
        li.add(1);
        li.add(4);
        for(int i:li){
            sum+=i;

        }
        System.out.print(sum);
        for(int i=0;i<li.size();i++){
            sum1=sum-li.get(i);
            ll.add(sum1);
        }
        for(int j:ll){
            System.out.println("\n"+j);

        }
        System.out.println("max = "+Collections.max(ll));
        System.out.println("min = "+Collections.min(ll));


    }
}
