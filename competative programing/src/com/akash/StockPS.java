package com.akash;

import java.util.Scanner;

public class StockPS {
    public static void main(String args[]){
        int[] stock1={7, 6, 4, 3, 1};
        int[] stock={7,1,5,3,6,4} ;
        int result=maxProfit(stock);
        System.out.println(result);
        result=maxProfit(stock1);
        System.out.println(result);
    }   private static int maxProfit(int[] stock) {
        int MinPrice=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<stock.length;i++){
            if(stock[i]<MinPrice){
                MinPrice=stock[i];
            }
            else if(stock[i]-MinPrice>profit){
                profit=stock[i]-MinPrice;
            }
        }
        return profit;
    }
}
