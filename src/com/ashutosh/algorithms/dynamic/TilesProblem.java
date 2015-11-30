package com.ashutosh.algorithms.dynamic;

/**
 * Created by dell on 11/30/2015.
 */
// Given a “2 x n” board and tiles of size “2 x 1?
// count the number of ways to tile the given board using the 2 x 1 tiles

public class TilesProblem {

    static int usingRecursion(int n){
        if(n==2 || n==1)return n;
        else return usingRecursion(n-2)+usingRecursion(n-1);
    }

    //dynamic solution is same as fibonacci

    public static void main(String args[]){

        int n=4;
        int ans=usingRecursion(n);                             //using recursive approach
        System.out.print("No of ways it can be done is: " +ans);
    }
}
