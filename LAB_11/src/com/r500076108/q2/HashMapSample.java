package com.r500076108.q2;

import java.util.HashMap;

public class HashMapSample {
    public static void main(String[] args){
        HashMap<String,Integer> hashMap =new HashMap<String,Integer>();
        hashMap.put("a",10);
        hashMap.put("b",11);
        hashMap.put("c",12);
        hashMap.put("d",13);
        hashMap.put("e",14);

        hashMap.get("b");
        if(hashMap.containsKey("ww")){
            System.out.println("Key found ");
        }
        else {
            System.out.println("Key not found ");
        }
        if(hashMap.containsValue(14))
        {
            System.out.println("value found");
        }
        else {
            System.out.println("value not found");
        }


        System.out.println("key set = "+hashMap.keySet());
        System.out.println("key & values are - \n"+hashMap);

    }
}
