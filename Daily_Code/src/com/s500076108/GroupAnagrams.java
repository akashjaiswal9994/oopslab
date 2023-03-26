package com.s500076108;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] arr) {
        List<List<String>> li=new ArrayList<>();
        HashMap<String, List<String> > map
                = new HashMap<>();

        // loop over all words
        for (int i = 0; i < arr.length; i++) {

            // convert to char array, sort and
            // then re-convert to string
            String word = arr[i];
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);

            // calculate hashcode of string
            // after sorting
            if (map.containsKey(newWord)) {

                map.get(newWord).add(word);
            }
            else {

                // This is the first time we are
                // adding a word for a specific
                // hashcode
                List<String> words = new ArrayList<>();
                words.add(word);
                map.put(newWord, words);
            }
        }
        for (String s : map.keySet()) {
            List<String> values = map.get(s);
            if (values.size() >= 1) {
                li.add(values);
            }
        }

//        for(int i=1;i<words.length;i++){
//            char[] sc=words[i-1].toCharArray();
//            char[] st=words[i].toCharArray();
//            Arrays.sort(sc);
//            Arrays.sort(st);
//            if(Arrays.compare(sc,st)==0){
//             ls
//            }
//
//        }

    return li;
    }
    public static void main(String[] args){
        String [] arr={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(arr));
        Math.abs(-123);
    }
}
