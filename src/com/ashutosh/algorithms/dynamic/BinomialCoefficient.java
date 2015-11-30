package com.ashutosh.algorithms.dynamic;

/**
 * Created by dell on 11/27/2015.
 */

// return C(n,k) for a given na and k
public class BinomialCoefficient {

    static int usingRecursion(int n,int k){
        if (k==0|| k==n)return 1;
        else{
            return usingRecursion(n-1,k-1)+usingRecursion(n-1,k);           //C(n,k)=C(n-1,k-1)+C(n-1,k)
        }
    }
    static int usingDynamic(int n,int k){
        int dyn[][]=new int[n+1][k+1];
        for(int i=0;i<=k;i++){
            dyn[i][i]=1;
        }
        for(int i=0;i<n;i++){
            dyn[i][0]=1;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=k;j++){
                dyn[i][j]=dyn[i-1][j-1]+dyn[i-1][j];
            }
        }
        return dyn[n][k];
    }


    public static void main(String args[]){

        int n=5;
        int k=2;
        //int ans=usingRecursion(n,k);          //using recursive approach
        int ans=usingDynamic(n,k);          // using dynamic
        System.out.print("Total ways to get change is: " +ans);
    }
}