package com.s500076108;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddSmallScore {
    public static  void main(String[] args){
        Scanner  sc= new Scanner(System.in);
        int n=0;
        int [] arr= {200,6,36,612,121,66,63,39,661,106,6,2,2,10,744};
        List<Integer> li=new ArrayList();

        int sum=0;
        n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<100){
                sum+=arr[i];
            }
            else if(arr[i]>100){
                li.add(sum);
                li.add(arr[i]);
                sum=0;
            }

        }

        for(int i=0;i<li.size();i++) {
            if(li.get(i)==0){
                li.remove(li.get(i));
            }
        }

        for(int i=0;i<li.size();i++){
           arr[i]=li.get(i);
        }
        for(int i=0;i<li.size();i++){
            System.out.print(arr[i]+" ");
        }


    }
}
