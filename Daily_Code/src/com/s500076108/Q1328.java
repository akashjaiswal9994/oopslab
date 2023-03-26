package com.s500076108;

public class Q1328 {
    public static String breakPalindrome(String pl) {
        if(pl.length()==1){
            return " ";
        }
        return fun(pl);
    }
    public static String fun(String s){
        StringBuilder string = new StringBuilder(s);
        if(s.charAt(0)!='a'){
            string.setCharAt(0, 'a');

        }
//        if(s.charAt(s.length()-1)!='b')
//            string.setCharAt(s.length()-1, 'b');

        for(int i=1;i<s.length();i++){
            System.out.println(s.charAt(i));
            if(s.charAt(i)!='a'){
                string.setCharAt(i, 'a');
                break;
            }
           else  if(i ==s.length()-1){
                string.setCharAt(s.length()-1, 'b');
            }
        }
        return string.toString();
    }
    public static void main(String[] args){
        String pl="aa";
         pl=breakPalindrome(pl);
        System.out.println(pl);

    }
}
