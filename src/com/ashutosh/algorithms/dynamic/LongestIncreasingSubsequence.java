package com.ashutosh.algorithms.dynamic;

/**
 * Created by dell on 11/25/2015.
 */
// longest increasing subsequence which is not necessarily contiguous

    public class LongestIncreasingSubsequence {
        static int usingDynamic(int arr[],int n){
            int dyn[]=new int[n];
            for(int i=0;i<n;i++)dyn[i]=1;
            for(int i=1;i<n;i++){
                for(int j=0;j<i;j++) {
                    if ((arr[i]>arr[j])&&(dyn[i]<dyn[j]+1)) dyn[i] = dyn[j] + 1;
                }
            }
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(max<dyn[i])max=dyn[i];
            }

            return max;
        }

    public static void main(String args[]){
        int arr[] ={ 10,22, 9, 33, 21, 50, 41, 60, 80 };//ans is 10,22,33,50,60,80
        int ans=usingDynamic(arr,arr.length);
        System.out.print("The length of the longest increasing subsequence is: "+ans);

    }
}
