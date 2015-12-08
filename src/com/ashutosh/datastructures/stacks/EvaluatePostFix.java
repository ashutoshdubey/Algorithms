package com.ashutosh.datastructures.stacks;

import java.util.Stack;

/**
 * Created by dell on 12/7/2015.
 */
//code to evaluate a postfix expression

public class EvaluatePostFix {
    static int solve(char []arr) {
        Stack<Integer> mystack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) mystack.push(Character.getNumericValue(arr[i]) );
            else {
                int val1 = mystack.pop();
                int val2 = mystack.pop();
                switch (arr[i]) {
                    case '+':
                        mystack.push(val2 + val1);
                        break;
                    case '-':
                        mystack.push(val2 - val1);
                        break;
                    case '*':
                        mystack.push(val2 * val1);
                        break;
                    case '/':
                        mystack.push(val2 / val1);
                        break;
                }
            }
        }
        return mystack.pop();
    }
    public static void main(String args[]){
        String str="231*+9-";
        char arr[]=str.toCharArray();
        System.out.print("The solution is: "+solve(arr));
    }
}
