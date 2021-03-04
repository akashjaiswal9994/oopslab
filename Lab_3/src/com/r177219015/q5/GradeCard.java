package com.r177219015.q5;

import java.util.Scanner;

public class GradeCard {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int marks[]=new int[10];
        int temp;
        for(int i= 0;i<10;i++)
        {
            System.out.print("Enter the marks -: ");
            marks[i]=sc.nextInt();
        }
        for(int j=0;j<10;j++)
        {
            for(int k=0;k<10-1-j;k++)
            {
                if(marks[k]>marks[k+1])
                {
                 temp=marks[k];
                 marks[k]=marks[k+1];
                 marks[k+1]=temp;
                }
            }
        }
        for(int ii =0;ii<10;ii++)
        {
           if(marks[ii]>=40 && marks[ii]<=50)
           {
               System.out.println("marks  = "+marks[ii]+", Status =  Pass");
           }
           else if(marks[ii]>=51 && marks[ii]<=75)
           {
               System.out.println("marks  = "+marks[ii]+", Status =  Merit");
           }
           else if(marks[ii]>75)
           {
               System.out.println("marks  = "+marks[ii]+", Status =  DISTINCTION");
           }
           else
           {
               System.out.println("marks  = "+marks[ii]+", Status =  FAIL");
           }
        }
    }

}
