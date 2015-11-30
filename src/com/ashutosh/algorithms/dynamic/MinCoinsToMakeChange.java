package com.ashutosh.algorithms.dynamic;

/**
 * Created by dell on 11/30/2015.
 */
//Given a value V, if we want to make change for V cents, and we have infinite supply of each of C = { C1, C2, .. , Cm} valued coins,
// what is the minimum number of coins to make the change?
//It is a variation of the cin change problem

public class MinCoinsToMakeChange {

    static int usingRecursion(int []arr,int n,int total){
        if(total==0)return 0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if (arr[i] <= total){
                int temp = usingRecursion(arr, n, total-arr[i]);
                // Check for INT_MAX to avoid overflow and see if
                // result can minimized
                if (temp != Integer.MAX_VALUE && temp + 1 < min)
                    min = temp + 1;
            }
        }
        return min;
    }
    static int usingDynamic(int arr[],int n,int total){
        int dyn[]=new int[total+1];
        dyn[0]=0;       //when total==0

        for(int i=1;i<=total;i++){
            dyn[i]=Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                if(i>=arr[j]){
                    int temp = dyn[i-arr[j]];
                    if(temp!=Integer.MAX_VALUE && temp+1<dyn[i]){
                        dyn[i]=temp+1;
                    }
                }
            }
        }
        return dyn[total];
    }

    public static void main(String args[]){

        int arr[] = {9, 6, 5, 1};
        int total=11;
        //int ans=usingRecursion(arr,arr.length,total);          //using recursive approach
        int ans=usingDynamic(arr,arr.length,total);          // using dynamic
        System.out.print("Minimum coins needed is: " +ans);
    }
}