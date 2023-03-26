package com.s500076108.leethcode2023.jan;

public class DetectCapitalQ520 {
    public  static void main(String[] args){
        String word="Leetcode";
        System.out.println(check(word));
    }
    static boolean check(String word){
        char[] wor=word.toCharArray();
        boolean flag=false;
        int countBig=0;
        int countLower=0;
        int countSen=1;
        if(Character.isUpperCase(wor[0])){

            for(int i=0;i<wor.length;i++){
                if(Character.isUpperCase(wor[i])){
                    countBig++;
                }
            }
        }
        else if(Character.isLowerCase(wor[0])){
            for(int i=0;i<wor.length;i++){
                if(Character.isLowerCase(wor[i])){
                    countLower++;
                }
            }
        }
         if(Character.isUpperCase(wor[0])){
            for(int i=1;i<wor.length;i++){
                if(Character.isLowerCase(wor[i])){
                    countSen++;
                }
            }
        }

        if(countBig== wor.length){
            flag=true;
        }
        else if(countLower== wor.length){
            flag=true;
        }
        else if(countSen==wor.length){
            flag=true;
        }
    return flag;
    }
}
