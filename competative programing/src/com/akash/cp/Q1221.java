package com.akash.cp;

import java.util.ArrayList;
import java.util.List;

public class Q1221 {
    public static void main(String[] args){
        String s="RlRRLLRLRL";
        List<String> list = new ArrayList<String>();
        String[] S=s.split("RL");
        for(int i=0;i<S.length;i++)
        {
            System.out.println(S[i]);
        }
    }
}
