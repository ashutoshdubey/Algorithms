package com.ashutosh.algorithms.dynamic;

/**
 * Created by dell on 11/27/2015.
 */
//find the sum of maximum sum subsequence of the given array
// such that the intgers in the subsequence are sorted in increasing order.

//similar to LIS but instead of length use sum for comparing

public class MaxSumIncreasingSubsequence {
    static int usingDynamic(int arr[],int n){
        int dyn[]=new int[n];
        for(int i=0;i<n;i++)dyn[i]=arr[i];
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++) {
                if ((arr[i]>arr[j])&&(dyn[i]<dyn[j]+arr[i])) dyn[i] = dyn[j] + arr[i];
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<dyn[i])max=dyn[i];
        }

        return max;
    }

    public static void main(String args[]){
        int arr[] ={1, 101, 2, 3, 100, 4, 5};
        int ans=usingDynamic(arr,arr.length);
        System.out.print("The sum of the maximum increasing subsequence is: "+ans);

    }
}
