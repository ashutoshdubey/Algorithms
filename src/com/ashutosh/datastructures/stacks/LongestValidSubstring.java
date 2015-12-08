package com.ashutosh.datastructures.stacks;

import java.util.Stack;

/**
 * Created by dell on 12/8/2015.
 */
public class LongestValidSubstring {
    static int findlength(char arr[]){
        Stack<Integer> mystack=new Stack<>();
        mystack.push(-1);
        int result=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='(')mystack.push(i);
            else{
                mystack.pop();
                if(!mystack.isEmpty()){
                    result=Math.max(result,i-mystack.peek());
                }else{
                    mystack.push(i);
                }
            }
        }
        return result;
    }
    public static void main(String args[]){
        String str="()(()))))";
        char arr[]=str.toCharArray();
        System.out.print("the length of longest valid substring is: " + findlength(arr));
    }
}
