package com.s500076108;

import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args){
        var result=isBalanced("");
        System.out.println(result);
    }
    public static int isBalanced(String s){
        Stack<Character> stack=new Stack<>();
        int count=0;
        if(s==""){
            return 0;
        }
        for(char chr:s.toCharArray()){
            if(chr=='('){
                stack.push(chr);
                count++;
            }
            if(chr==')'){
                if(!stack.empty()){
                    var top=stack.pop();
                    if(top != '('){
                        break;
                    }
                    else {
                        count++;
                    }
                }


            }
        }
        if(!stack.empty()){
            count=Math.abs(stack.size()-count);
        }
        return count;
    }
}
