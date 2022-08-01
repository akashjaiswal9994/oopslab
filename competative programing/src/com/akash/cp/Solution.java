package com.akash.cp;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static String getPhoneNumber(String s) {
        // Write your code here
        String ans = "";
        List<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("double")) {
                list.set(i,list.get(i+1));
            }
           else if (list.get(i).equals("triple")) {
                list.set(i,list.get(i+1));
                list.add(i,list.get(i+1));

            }

        }




        HashMap<String, String> hashmap = new HashMap<String, String>();
        hashmap.put("zero", "0");
        hashmap.put("one", "1");
        hashmap.put("two", "2");
        hashmap.put("three", "3");
        hashmap.put("four", "4");
        hashmap.put("five", "5");
        hashmap.put("six", "6");
        hashmap.put("seven", "7");
        hashmap.put("eight", "8");
        hashmap.put("nine", "9");
        for (int i = 0; i < list.size(); i++) {
            if (hashmap.containsKey(list.get(i))) {
                ans += hashmap.get(list.get(i));
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
     String result =getPhoneNumber("two one nine six double eight one six four triple six zero");
        System.out.println(result);
    }
}
