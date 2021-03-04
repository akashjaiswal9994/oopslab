package com.r177219015.q1;

import java.util.Scanner;

public class DigitsCombination {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the three Digit number -: ");
         int value[]=new int[3];
         for (int w=0;w<3;w++) {
             value[w]= Integer.parseInt(sc.next());
         }
        int i,j,k;
        for( i =0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                for(k=0;k<3;k++)
                {
                    if(i!=j &&j!=k&& k!=i)
                    {
                        System.out.println(value[i]+""+value[j]+""+value[k]);
                    }

                }
            }
        }

    }
}
