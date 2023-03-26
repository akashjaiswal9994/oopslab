package com.s500076108.sonnet.assignmnet;


import java.util.TreeMap;

public class Q10 {
    public  static void main(String[] args){
        TreeMap<Integer,String> hm=new TreeMap<>();
        hm.put(10,"rose");
        hm.put(20,"Jasmine");
        hm.put(30,"Lotus");
        hm.put(40,"Lily");
        hm.put(50,"Sunflower");
        System.out.println("Map before removing: ");
        System.out.println(hm);
        System.out.println("value removed");
        System.out.println(hm.pollFirstEntry());
        System.out.println("Map after removing");
        System.out.println(hm);
    }
}
