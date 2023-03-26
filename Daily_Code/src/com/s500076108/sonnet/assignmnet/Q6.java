package com.s500076108.sonnet.assignmnet;

import java.util.HashSet;
import java.util.Set;

public class Q6 {
    public static  void main(String[] args){
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        s1.add(1);
        s1.add(7);
        s1.add(5);
        s1.add(8);
        s1.add(6);

        s2.add(3);
        s2.add(4);
        s2.add(6);
        s2.add(8);
        s2.add(5);
        s1.retainAll(s2);
        System.out.println("Intersection of set s1 and s2 = "+s1);



    }
}
