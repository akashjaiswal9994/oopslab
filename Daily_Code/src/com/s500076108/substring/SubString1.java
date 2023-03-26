package com.s500076108.substring;

import java.util.*;

public class SubString1 {
    public static void main(String[] args){
        List<String> li=new ArrayList<>();
        li.add("un");
        li.add("ue");
        li.add("iq");
       int result= maxLength(li);
        System.out.println(result);
    }
    public static int maxLength(List<String> arr) {
        Set<Character> hs=new HashSet<>();
        for ( String string :arr )
        {
            for ( char c : string.toCharArray() )
            {
                hs.add(c);
            }
        }
        System.out.println(hs);
        return hs.size();
    }
}
