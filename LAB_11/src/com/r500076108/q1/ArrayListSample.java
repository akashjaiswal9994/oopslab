package com.r500076108.q1;

import java.util.*;

public class ArrayListSample {
    public static void main(String[] args){
        StudentData studentData1 =new StudentData(15,"Akash");
        StudentData studentData2 =new StudentData(16,"Aman");
        StudentData studentData3 =new StudentData(17,"Abhishant");
        StudentData studentData4 =new StudentData(18,"Anamika");
        StudentData studentData5 =new StudentData(19,"Adarsh");
        StudentData studentData6 =new StudentData(15,"Akash");
        StudentData studentData7 =new StudentData(16,"Aman");
        StudentData studentData8 =new StudentData(17,"Abhishant");
        List<StudentData> li =new ArrayList<StudentData>();
        li.add(studentData1);
        li.add(studentData2);
        li.add(studentData3);
        li.add(studentData4);
        li.add(studentData5);
        li.add(studentData6);
        li.add(studentData7);
        li.add(studentData8);

        //System.out.println("After Iterator");
        for (StudentData studentData : li) {
            System.out.println(studentData);
        }
        System.out.println("\n after reverse \n");
        Collections.reverse(li);
        for (StudentData studentData : li) {
            System.out.println(studentData);
        }



    }
}
