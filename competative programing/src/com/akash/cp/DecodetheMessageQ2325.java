package com.akash.cp;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class DecodetheMessageQ2325 {
    public static void main(String[]args){
        String key="the quick brown fox jumps over the lazy dog";
        String message="vkbs bs t suepuv";
        decodeMessage(key, message);
    }

    private static void decodeMessage(String key, String message) {
        Map<Character,Character> hs=new HashMap<Character,Character>();

        System.out.println(key);
        char ch='a';
        for(int i=0;i<key.length();i++){
            if(!hs.containsValue(key.charAt(i)) && key.charAt(i)!=' '){
                hs.put(ch,key.charAt(i));
                ch++;
            }
            else{
                hs.put(' ',' ');
            }
        }
        int j=0;

        String str="";
        for(int i=0;i<message.length();i++) {

           str+= getSingleKeyFromValue(hs,message.charAt(i));
           //message=message.replace(message.charAt(i),get);
        }
        System.out.print(str);

    }

    public static <K, V> K getSingleKeyFromValue(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }

        }

        return (K)" ";

    }


}
