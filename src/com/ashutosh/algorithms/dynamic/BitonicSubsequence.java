package com.ashutosh.algorithms.dynamic;

/**
 * Created by dell on 11/25/2015.
 */
//a subsequence of arr[] is called Bitonic if it is first increasing, then decreasing

public class BitonicSubsequence {
    static int usingDynamic(int arr[],int n){    //  answer is max of inc[i] +dec[i] -1
        int inc[]=new int[n];                    // increasing subsequence taken from left to right
        int dec[]=new int[n];                     // decreasing subsequence taken from right to left
        for(int i=0;i<n;i++){
            inc[i]=1;
            dec[i]=1;
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j] && inc[i]<inc[j]+1)inc[i]=inc[j]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            for(int j=n-1;j>i;j--){
                if((arr[i]>arr[j]) && (dec[i]<dec[j]+1))dec[i]=dec[j]+1;
            }
        }

        int bitonic=-1;
        for(int i=0;i<n;i++){
            if(inc[i]+dec[i]-1>bitonic)bitonic=inc[i]+dec[i]-1;
        }
        return bitonic;
    }

    public static void main(String args[]){
        int arr[] = {1, 11, 2, 10, 4, 5, 2, 1};
        int ans=usingDynamic(arr,arr.length);
        System.out.print("The length of the longest bitonic subsequence is: "+ans);

    }
}
