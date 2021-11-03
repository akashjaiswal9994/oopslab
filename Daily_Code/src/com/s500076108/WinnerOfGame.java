package com.s500076108;

import java.util.Scanner;

public class WinnerOfGame {
    public String ticTakToe(int mov[][]){
     int checkLength=mov.length;

     return checkLength==9?"Draw":"Pending";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[][] moves=new String[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                moves[i][j]=sc.next();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(moves[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
