package com.ashutosh.algorithms.dynamic;

/**
 * Created by dell on 11/30/2015.
 */
//The person can climb either 1 stair or 2 stairs at a time. Count the number of ways, the person can reach the top.

public class Stairs {
    static int usingRecursion(int n){
        if(n==1 || n==2)return n;
        else return usingRecursion(n-1)+usingRecursion(n-2);
    }

// dynamic solution can be written similar to fibonacci solution
    public static void main(String args[]){
        int n=4;
        int ans=usingRecursion(n);
        System.out.print("Number of ways to reach the nth stair is: " +ans);
    }
}
