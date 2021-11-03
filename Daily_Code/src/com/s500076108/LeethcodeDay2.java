package com.s500076108;

import java.util.stream.Stream;

public class LeethcodeDay2 {
    public static boolean isPrefixString(String s, String[] words) {
        if (Stream.of(words).anyMatch(s::startsWith)){
            return true;
        }
            return false;
    }
    public static void main(String[] args) {

        String[] arr = {"Feeks", "for", "Gfor"};

        // Given String
        String str = "GeeksforGeeks";
       boolean result= isPrefixString(str, arr);
        System.out.println(result);
    }

}
