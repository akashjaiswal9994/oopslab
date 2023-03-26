package com.s500076108;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = -123;
        int result = check(x);
        System.out.println(result);
    }

    private static int check(int x) {

//        if( x>Math.pow(-2,31) ||x>(Math.pow(2,31)-1))
//            return 0;
        try {

            StringBuilder sb = new StringBuilder();
            String re = sb.append(Math.abs(x)).reverse().toString();
            return (x < 0) ? Integer.parseInt(re) * -1 : Integer.parseInt(re);
        }catch(Exception e){
            return 0;
        }
    }
}
