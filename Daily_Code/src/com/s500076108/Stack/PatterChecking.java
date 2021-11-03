package com.s500076108.Stack;

import java.util.Stack;

public class PatterChecking {
    public static void main(String[] args){
        String sample="(<1+2)>";
        CheckExpression checkExpression=new CheckExpression();
     var result= checkExpression.isBalanced(sample);
        System.out.println(result);
    }
}
