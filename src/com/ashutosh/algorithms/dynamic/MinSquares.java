package com.ashutosh.algorithms.dynamic;

/**
 * Created by dell on 12/1/2015.
 */
//Given a number n, find the minimum number of squares that sum to n.
public class MinSquares {

    static int usingRecursion(int n){
        if(n==1)return 1;
        int x=(int)Math.sqrt(n);
        if(x*x==n){
           return 1;
        }else{
           return 1+ usingRecursion(n-x*x);
        }
    }
    static int usingDynamic(int n){
        int []dyn=new int[n+1];
        dyn[1]=1;
        for(int i=2;i<=n;i++){
            int x=(int)Math.sqrt(i);
            if(x*x==i){
                dyn[i]=1;
            }else{
                dyn[i]=1+dyn[i-x*x];
            }
        }
        return dyn[n];
    }

    public static void main(String args[]){
        int n=6;
        //int ans=usingRecursion(n);                             //using recursive approach
        int ans=usingDynamic(n);
        System.out.print("Minimum number of squares is : " +ans);
    }
}