package com.akash.cp;

import java.util.HashMap;
import java.util.Iterator;

public class Q771 {


    public static void main(String[] args){
        String jewels = "aA";
        String stone="aAAbbbb";
        gem(jewels,stone);
    }

    private static void gem(String jewels, String stones) {
        HashMap<Character, Integer> map=new HashMap();
        for(int i=0;i<jewels.length();i++){
            map.put(jewels.charAt(i),0 );
        }
        int count =0;
        for(int i=0;i<stones.length();i++){
            if(map.containsKey(stones.charAt(i))){
                map.put(stones.charAt(i),map.get(stones.charAt(i))+1);
                //count+=map.get(stones.charAt(i));
            }
        }
       for( var val:map.values()){
           count+=val;
       }
        System.out.println(count);
    }
}
