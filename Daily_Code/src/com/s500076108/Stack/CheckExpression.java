package com.s500076108.Stack;

import java.util.Stack;

public class CheckExpression {
    public boolean isBalanced(String str){
        Stack<Character> stk=new Stack<>();
        for(char ch:str.toCharArray()){
            if(isLeftBracket(ch)){
                stk.push(ch);
            }
            if(isRightBracket(ch)){
                if(stk.empty()){
                    return false;
                }
                var top=stk.pop();
                if(matchExpression(top,ch)){
                    return false;
                }

            }
            
        }
        return stk.empty();
    }
    private boolean isLeftBracket(char ch){
        return ch=='('|| ch=='<'||ch=='['||ch=='{';
    }
    private  boolean isRightBracket(char ch){
        return  ch==')'||ch=='>'||ch==']'||ch=='}';
    }
    private boolean matchExpression(char left ,char right){
        return (right==')'&& left!='(') ||
                (right=='>'&& left!='<') ||
                (right==']'&& left!='[') ||
                (right=='}'&& left!='{') ;

    }
}
