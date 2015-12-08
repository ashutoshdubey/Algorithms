package com.ashutosh.datastructures.stacks;

import java.util.Stack;

/**
 * Created by dell on 12/7/2015.
 */
public class InfixToPostfix {
    static boolean isOperand(char ch){
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }
    static int Prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }
    static void convert(char []exp){
        Stack<Character> mystack=new Stack<>();
        for(int i=0;i<exp.length;i++){
            if(isOperand(exp[i]))System.out.print(exp[i]);
            else if (exp[i] == '(')mystack.push( exp[i]);
            else if (exp[i] == ')'){
                while (!mystack.isEmpty() && mystack.peek() != '(') {
                    System.out.print(mystack.pop());
                }
                if (!mystack.isEmpty() && mystack.peek() != '(')
                    return ; // invalid expression
                else
                    mystack.pop();
            }else{
                while (!mystack.isEmpty() && Prec(exp[i]) <= Prec(mystack.peek())) {
                    System.out.print(mystack.pop());
                }
                mystack.push(exp[i]);
            }
        }
        while (!mystack.isEmpty()) {
            System.out.print(mystack.pop());
        }
    }
    public static void main(String args[]){
         String str= "a+b*(c^d-e)^(f+g*h)-i";
        char exp[]=str.toCharArray();
        convert(exp);
    }
}
