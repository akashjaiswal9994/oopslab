package com.s500076108.sonnet.assignmnet;

import java.util.TreeSet;

public class Q9 {
    public  static void main(String[] args){
        TreeSet<Integer> hs=new TreeSet<>();
        hs.add(1);
        hs.add(12);
        hs.add(21);
        hs.add(13);
        hs.add(31);
        hs.add(14);
        hs.add(19);
        hs.add(89);
        hs.add(92);

        System.out.println(" element in a tree set which is greater than\n" +
                "or equal to the 30 = "+hs.ceiling(30));
    }

}
