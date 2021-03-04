package com.r177219015.q4;

public class GreaterNumber {
    public static void main(String args[])
    {
        int sum=0;
        for (int i=40;i<250;i++)
        {
            if(i%5==0)
            {
                sum+=i;
            }
        }
        System.out.println("sum = "+sum);
    }
}
