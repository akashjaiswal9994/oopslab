package com.akash.cp;

import java.util.HashMap;

public class Q1528 {
    public static void main(String[] args){
        String s="codeleet";
        int[] in={4,5,6,7,0,2,1,3};
        char[] ch=s.toCharArray();
        String result = "";
        HashMap<Integer,Character> hashMap=new HashMap<Integer,Character>();
        for(int i=0;i<in.length;i++) {
            hashMap.put(in[i],ch[i]);
        }
        for(char i:hashMap.values()){
            result+=i;

        }
        System.out.println(result);

    }
}
