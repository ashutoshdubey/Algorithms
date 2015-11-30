package com.ashutosh.algorithms.dynamic;

/**
 * Created by dell on 11/23/2015.
 */
public class MinJumpsToReachEnd {
    static int minjumps(int []arr,int i,int n){
        if (i>=n)return 0;
        else{
            int min=Integer.MAX_VALUE;
            for(int j=1;j<=arr[i];j++){
                int steps=1+minjumps(arr,i+j,n);
                if(steps<min)min=steps;

            }
            return min;
        }
    }
    static int minusingmemoisation(int arr[],int n){
        int jumps[]=new int[n];
        if(n==0 || arr[0]==0)return Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            jumps[i]=Integer.MAX_VALUE;
            for(int j=0;j<=i;j++){
                if(i<=j+arr[j] && arr[j]!=Integer.MAX_VALUE)jumps[i]=Math.min(jumps[i],jumps[j]+1);
            }
        }
        return jumps[n-1];
    }


    public static void main(String args[]){

        int arr[]={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        //int ans=minjumps(arr,0,arr.length-1);          //using recursive approach
        int ans=minusingmemoisation(arr,arr.length);          // using memoisation
        System.out.print("Mnimum jumps needed is: " +ans);
    }
}
