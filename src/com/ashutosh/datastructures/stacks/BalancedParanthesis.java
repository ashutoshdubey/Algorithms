package com.ashutosh.datastructures.stacks;

import java.util.Stack;

/**
 * Created by dell on 12/7/2015.
 */
public class BalancedParanthesis {
    static boolean checkParanthesis(char exp[]){
        Stack<Character> mystack=new Stack<>();
        for(int i=0;i<exp.length;i++){
            if(exp[i]=='[' || exp[i]=='{' || exp[i]=='('){
                mystack.push(exp[i]);
            }else {
                if (mystack.isEmpty()) return false;
                else if (exp[i] == '}') {
                    if (mystack.peek() != '{') return false;
                    else mystack.pop();
                }else if (exp[i] == ']') {
                    if (mystack.peek() != '[') return false;
                    else mystack.pop();
                }else{
                    if (mystack.peek() != '(') return false;
                    else mystack.pop();
                }
            }
        }
        if(mystack.isEmpty())return true;
        else return false;
    }
    public static void main(String args[]){
        String str="([{()}]{[]})";
        char exp[] =str.toCharArray() ;
        if(checkParanthesis(exp))System.out.print("The paranthesis are balanced");
        else System.out.print("the paranthesis are not balanced");
    }
}
