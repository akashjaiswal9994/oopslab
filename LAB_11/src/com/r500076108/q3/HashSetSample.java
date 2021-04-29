package com.r500076108.q3;

import com.r500076108.q1.StudentData;

import java.util.*;

public class HashSetSample {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StudentData studentData1 =new StudentData(15,"Akash");
        StudentData studentData2 =new StudentData(16,"Raman");
        StudentData studentData3 =new StudentData(17,"rohit");
        StudentData studentData4 =new StudentData(18,"Priyal");
        StudentData studentData5 =new StudentData(19,"Om");
        HashSet hs =new HashSet();
        hs.add(studentData1);
        hs.add(studentData2);
        hs.add(studentData3);
        hs.add(studentData4);
        hs.add(studentData5);
        Iterator ii= hs.iterator();
        System.out.println("*****************************");
        while(ii.hasNext()){
            System.out.println(ii.next());
        }
        System.out.println("*****************************");

        List hh=new ArrayList();
        hh.add("AIMl");
        hh.add("big Data");
        hs.addAll(hh);
        System.out.println("\nafter adding other collection object to hashset object\n");
        System.out.println("*****************************");
        for (Object h : hs) {
            System.out.println(h);
        }
        System.out.println("*****************************\n");

        if(hs.contains("AIML")){
            System.out.println("name exist ");
        }
        else {
            System.out.println("name not exist");
        }
        hs.clear();
        System.out.println("*****************************");
        System.out.println("after deleting...size of the Hashset = "+hs.size());
        System.out.println("*****************************");
    }
}
