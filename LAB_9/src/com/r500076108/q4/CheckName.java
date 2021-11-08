package com.r500076108.q4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckName {
    public static  void main(String args[]){
        int count=0;
        List<Integer> list=new ArrayList<>();
        String name=new String("akash");
        int nameLength=name.length();

        for(int i=0;i<nameLength;i++) {
            if (name.charAt(i)=='a') {
                list.add(i);
                count++;
            }
        }
        System.out.println("name => "+name);
        System.out.println("length of name = "+nameLength);
        if(name.indexOf('a')!=-1)
        {
            System.out.println("'a' is present in the name ");
        }
        System.out.println("number of time 'a' is present in name  "+count);
        for(Integer j:list){
            System.out.println("'a ' is present at location  = "+(j+1));
        }
    }
}
