package com.s500076108.leethcode2023.jan;

import java.util.HashMap;
import java.util.Stack;

public class WordPatternQ290 {
    public static boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
        return false;
        }

            HashMap<String, Character> strToChar = new HashMap<>();
            HashMap<Character, String> charToStr = new HashMap<>();
            for (int i = 0; i < pattern.length(); i++) {
                char c = pattern.charAt(i);
                String word = words[i];
                if (!charToStr.containsKey(c)) {
                    charToStr.put(c, word);
                }
                if (!strToChar.containsKey(word)) {
                    strToChar.put(word, c);
                }

                if (!charToStr.get(c).equals(word) || !strToChar.get(word).equals(c)) {
                    return false;
                }

            }


            //result;

        return true;
    }
     public  static void main(String[] args){
        String s1="abb", s2="dog cat cat dog";
        System.out.println(wordPattern(s1,s2));
    }

}
