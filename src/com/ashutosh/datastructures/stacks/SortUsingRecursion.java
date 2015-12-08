package com.ashutosh.datastructures.stacks;

import java.util.Stack;

/**
 * Created by dell on 12/7/2015.
 */
//sort a stack using recursion

public class SortUsingRecursion {
    static void sortStack(Stack<Integer> mystack){
        if(!mystack.isEmpty()){
            int temp = mystack.pop();
            sortStack(mystack);
            insert(mystack, temp);
        }
    }
    static void insert(Stack <Integer> mystack,int temp){
        if(mystack.isEmpty() || mystack.peek()>temp){
            mystack.push(temp);
        }else{
            int curr=mystack.pop();
            insert(mystack,temp);
            mystack.push(curr);
        }
    }
    static void printStack(Stack <Integer> mystack){
        while(!mystack.isEmpty())System.out.print(mystack.pop()+" ");
    }
    public static void main(String args[]){
        Stack<Integer> mystack=new Stack<>();
        mystack.push(30);
        mystack.push(-5);
        mystack.push(18);
        mystack.push(14);
        mystack.push(-3);
        sortStack(mystack);
        printStack(mystack);
    }
}
