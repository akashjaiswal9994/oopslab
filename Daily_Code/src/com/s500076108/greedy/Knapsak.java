package com.s500076108.greedy;

public class Knapsak {
    public static void main(String args[]){
        int[] profit ={10,5,15,7,6,18,3};
        int[] weight ={2,3,5,7,1,4,1};
        int[] proWei =new int[profit.length];
        int max=15;
        if(profit.length==weight.length) {
            for (int i = 0; i < profit.length; i++) {
                 proWei[i]=profit[i]/weight[i];
            }
            for(int i:proWei){
                System.out.print(i+",");
            }
        }
        else {
            System.out.println("length of array are not equal");
        }
    }
}
