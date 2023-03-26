package com.s500076108;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameRandom {
    public static String text(String user){
        char lastChar=user.charAt(user.length()-1);
        Random r = new Random();
        String machineWord="";
        for(int i =0; i < user.length()-1; i++) {
            int rand = new Random().nextInt(52);
            char start = (rand < 26) ? 'A' : 'a';
            char word= (char) (start + rand % 26);
            machineWord+=word;
        }
        return  Character.toUpperCase(lastChar)+machineWord.toUpperCase();
    }
    private static int checkVowel(String humanWord) {

        int count=0;
        List<Character> vowel=new ArrayList<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');

        for(int i=0;i<humanWord.length();i++){
            if(vowel.contains(humanWord.charAt(i))){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int userVowelCount=0;
        int machineVowelCount=0;
        for(int i=0;i<10;i++){
            System.out.println("*****************Round "+(i+1)+"**********************\n");
            System.out.print("enter the string :");
            String humanText=sc.next();
            String machineText=text(humanText);
            System.out.println(machineText);
            if(checkVowel(humanText)>checkVowel(machineText)){
                System.out.println("User Win");
            }
            else {
                System.out.println("Machine Win");
            }
            System.out.println("*********************************************************\n");
        }


    }


}
