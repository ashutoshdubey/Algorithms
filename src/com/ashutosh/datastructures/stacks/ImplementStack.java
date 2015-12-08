package com.ashutosh.datastructures.stacks;

/**
 * Created by dell on 12/7/2015.
 */
//stack implementation using arrays

public class ImplementStack {
    static class Stack{
        int size;
        int top;
        int arr[];
        Stack(int size){
            this.size=size;
            this.top=-1;
            int arr[]=new int[size];
        }
        boolean push(Stack mystack,int val){
            mystack.top++;
            if(mystack.top<=mystack.size-1) {
                mystack.arr[top]= val;
                return true;
            }else return false;
        }
        int pop(Stack mystack){
            if(mystack.top>-1){
                mystack.top--;
                return mystack.arr[mystack.top+1];

            }else return -1;
        }
        boolean isEmpty(Stack mystack){
            if(mystack.top==-1){
                return true;
            }else return false;
        }
        int peek(Stack mystack){
            if(mystack.isEmpty(mystack))return -1;
            else return mystack.arr[mystack.top];
        }
    }

    public static void main(String args[]){
        Stack mystack=new Stack(5);
        //System.out.print(mystack.push());
    }
}
